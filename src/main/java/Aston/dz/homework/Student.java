package Aston.dz.homework;

public class Student {
    private String nameStudent;
    private Course course;

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void studying(){
        System.out.println("Студент " + nameStudent + " обучается.");
    }

}
