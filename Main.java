import java.util.ArrayList;

class Student 
 {
    public String name;
    public String program;
    public int semester;
    public ArrayList<course> courses;

     Student(String name, String program, int semester)
     {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(course Course) {
        courses.add(Course);
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (course Course : courses) {
            System.out.println("- " + Course.getName());
        }
    }

    public void displayFailedCourses() {
        System.out.println("Marks less than 40 " + name + ":");
        for (course course : courses) {
            if (course.getMark(this) < 40) {
                System.out.println("- " + course.getName());
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Varun", "Computer Science", 3);
        Student student2 = new Student("Raj", "Engineering", 2);

        course course1 = new course("Java Programming");
        course course2 = new course("Database Management");

        student1.registerCourse(course1);
        student1.registerCourse(course2);
        student2.registerCourse(course1);

        course1.setMark(75);
        course2.setMark(35); 

        student1.displayInfo();
        System.out.println();
        student2.displayInfo();

        System.out.println();
        student1.displayFailedCourses();
    }
}


