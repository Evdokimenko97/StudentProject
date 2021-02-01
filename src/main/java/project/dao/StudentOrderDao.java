package project.dao;

import project.domain.StudentOrder;
import project.exception.DaoException;

import java.util.List;

public interface StudentOrderDao
{
    Long saveStudentOrder(StudentOrder so) throws DaoException;
    
    List<StudentOrder> getStudentOrders() throws DaoException;
}
