package project.validator;

import project.domain.wedding.AnswerWedding;
import project.domain.StudentOrder;

public class WeddingValidator
{
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }
}
