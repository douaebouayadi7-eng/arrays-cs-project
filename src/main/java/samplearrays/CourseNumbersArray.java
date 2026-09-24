package samplearrays;

public class CourseNumbersArray {
    private int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
    public void addCourse(int newCourse){
        int[] updatedCourses= new int[registeredCourses.length+ 1];
        for (int i=0; i<registeredCourses.length; i++){
            updatedCourses[i]= registeredCourses[i];
        }
        updatedCourses[registeredCourses.length]= newCourse;
        registeredCourses=updatedCourses;
    }
    public void printCourses(){
        for (int course: registeredCourses){
            System.out.println(course+" ");
        }
        System.out.println();
    }
    public boolean checkCourses(int number){
        for(int course: registeredCourses){
            if (course== number) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        CourseNumbersArray student= new CourseNumbersArray();
        System.out.println("Initial registered courses: ");
        student.printCourses();
        student.addCourse(6767);
        System.out.println("\nCourses after adding course 6767");
        student.printCourses();
        System.out.println("\nDoes it contain course 6767?");
        System.out.println(student.checkCourses(6767));

    }
}
