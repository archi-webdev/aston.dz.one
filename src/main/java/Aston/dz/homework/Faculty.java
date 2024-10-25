package Aston.dz.homework;

public class Faculty {
    private String nameFaculty;
    private String dean;

    public Faculty(String nameFaculty, String dean) {
        this.nameFaculty = nameFaculty;
        this.dean = dean;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }
}
