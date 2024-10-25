package Aston.dz.homework;

public class Course {
    private String nameCourse;
    private Faculty faculty;

    public Course(String nameCourse, Faculty faculty) {
        this.nameCourse = nameCourse;
        this.faculty = faculty;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
