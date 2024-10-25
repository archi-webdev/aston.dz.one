package Aston.dz.homework;

public class Evaluation {
    private int evaluation;
    private Student student;

    public Evaluation(int evaluation, Student student) {
        this.evaluation = evaluation;
        this.student = student;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public Student getStudent() {
        return student;
    }
}