package Aston.dz.homework;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private static List<Evaluation> evaluations = new ArrayList<>();

    private Archive() {
    }

    public static List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public static void addEvaluationToArchive (Evaluation evaluation){
        evaluations.add(evaluation);
    }
}
