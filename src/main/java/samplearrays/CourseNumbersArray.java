package samplearrays;

public class CourseNumbersArray {
    private int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
    public addCourses(int newCourse){
        int[] updatedCourses= new int[registeredCourses.length+ 1];
        for (int i=0; i<registeredCourses.length; i++){
            updatedCourses[i]= registeredCourses[i];
        }
        updatedCourses[registeredCourses.length]= newCourse;
        registeredCourses=updatedCourses;
    }
    public static void main(String[] args) {

    }
}
