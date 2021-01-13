package model;

import java.util.List;

public class Lector {
    private Degree degree;
    private List<Department> departments;

    public enum Degree {
        ASSISTANT, ASSOCIATE_PROFESSOR, PROFESSOR
    }
}
