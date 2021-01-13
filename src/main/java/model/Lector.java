package model;

import lombok.Data;

import java.util.List;

@Data
public class Lector {
    private Degree degree;
    private List<Department> departments;

    public enum Degree {
        ASSISTANT, ASSOCIATE_PROFESSOR, PROFESSOR
    }
}
