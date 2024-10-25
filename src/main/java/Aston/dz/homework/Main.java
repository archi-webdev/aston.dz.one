package Aston.dz.homework;

public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty("ИТ", "И.И. Иванов");
        Course courseJava = new Course("Java ученик", faculty);
        Course courseHTML = new Course("HTML ученик", faculty);
        Lecturer lecturerPPP = new Lecturer("П.П. Петрович", courseJava);
        Lecturer lecturerCCC = new Lecturer("С.С. Сидоров", courseHTML);
        Student student1 = new Student("Аня");
        Student student2 = new Student("Боря");
        Student student3 = new Student("Вера");
        Student student4 = new Student("Гриша");
        lecturerCCC.registrationStudent(student1);
        lecturerCCC.registrationStudent(student2);
        lecturerPPP.registrationStudent(student3);
        lecturerPPP.registrationStudent(student4);
        student1.studying();
        student2.studying();
        student3.studying();
        student4.studying();
        lecturerCCC.evaluationStudent(5, student1);
        lecturerCCC.evaluationStudent(5, student2);
        lecturerPPP.evaluationStudent(5, student3);
        lecturerPPP.evaluationStudent(5, student4);
    }

}
