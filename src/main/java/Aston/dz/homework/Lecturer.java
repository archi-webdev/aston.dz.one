package Aston.dz.homework;

public class Lecturer {
    private String nameLecturer;
    private Course course;

    public Lecturer(String nameLecturer, Course course) {
        this.nameLecturer = nameLecturer;
        this.course = course;
    }

    public String getNameLecturer() {
        return nameLecturer;
    }

    public void setNameLecturer(String nameLecturer) {
        this.nameLecturer = nameLecturer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void registrationStudent (Student student) {
        student.setCourse(course);
        System.out.printf("Студент %s записан на курс %s.", student.getNameStudent(), course.getNameCourse());
    }

    public void evaluationStudent(int evaluation, Student student) {
        Archive.addEvaluationToArchive(new Evaluation(evaluation, student));
        System.out.printf("%s оценка %d за курс %s. \n Оценка добавлена в архив.\n", student.getNameStudent(), evaluation, student.getCourse().getNameCourse());

    }
}
