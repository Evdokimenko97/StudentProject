package project.dao;

import project.domain.CountryArea;
import project.domain.PassportOffice;
import project.domain.RegisterOffice;
import project.domain.Street;
import project.exception.DaoException;

import java.util.List;

public interface DictionaryDao
{
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;
}
