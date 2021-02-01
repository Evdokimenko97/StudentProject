package project.validator.register;

import project.domain.register.CityRegisterResponse;
import project.domain.Person;
import project.exception.CityRegisterException;
import project.exception.TransportException;

public interface CityRegisterChecker
{
    CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException;
}
