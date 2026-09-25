package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        int maxAge=0;
        Student oldestStudent= new Student();
        for(Student student: students){
            if (student.getAge()>maxAge){
                maxAge=student.getAge();
                oldestStudent=student;
            }
        }

        return oldestStudent;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count= 0;
        for (Student student: students){
            if (student.getAge()>=18){
                count++;
            }
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double gradeSum= 0;
        for( Student student: students){
            gradeSum+=student.getGrade();
        }
        return gradeSum/students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {

        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, (a, b) -> b.getGrade() - a.getGrade());
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for (Student student: students){
            if( student.getGrade()>=15){
                System.out.println(student.getName());
            }
        }
    }

    // 8) Update Student Grade by id
    public static void updateGrade(Student[] students, int id, int newGrade) {
        for (Student student: students){
            if (student.getId()==id){
                student.setGrade(newGrade);
            }
        }
    }
    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for (int i=0; i<students.length; i++){
            for (int j=i+1; j<students.length; j++){
                if (students[i].getName().equals(students[j].getName())){
                    return true;
                }
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents= new Student[students.length+1];
        for (int i=0;i<students.length; i++){
            newStudents[i]=students[i];
        }
        newStudents[students.length]= newStudent;
        return newStudents;
    }


    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr= new Student[5];
        arr[0]= new Student(1, "Aya", 18, 18);
        arr[1]= new Student(2, "Douae", 19, 19);
        arr[2]= new Student(3, "Malak", 20, 15);
        arr[3]= new Student(4, "Karima", 17, 16);
        arr[4]= new Student(5, "Bilal", 16, 17);


        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("The oldest student is: " +ManageStudent.findOldest(arr));


        // 3) Count adults
        System.out.println("The oldest student is: " +ManageStudent.countAdults(arr));




        // 4) Average grade
        System.out.println("The average grade is: " +ManageStudent.averageGrade(arr));



        // 5) Find by name
        System.out.println("The student with the name: Aya ia " +ManageStudent.findStudentByName(arr, "Aya"));



        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        updateGrade(arr, 4, 20);
        System.out.println("\nUpdated id=4: " + findStudentByName(arr, "Karima"));

        // 9) Duplicate names
        System.out.println("\nDuplicates found? " + hasDuplicateNames(arr));


        // 10) Append new student
        Student[] biggerArr = appendStudent(arr, new Student(6, "Dina", 18, 12));
        System.out.println("\n== After appending ==");
        for (Student s : biggerArr) System.out.println(s);

    }
}

