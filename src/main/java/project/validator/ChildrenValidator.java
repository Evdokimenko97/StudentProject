package project.validator;

import project.domain.children.AnswerChildren;
import project.domain.StudentOrder;

public class ChildrenValidator
{
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
