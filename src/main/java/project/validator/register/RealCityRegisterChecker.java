package project.validator.register;

import project.domain.register.CityRegisterResponse;
import project.domain.Person;
import project.exception.CityRegisterException;
import project.exception.TransportException;

public class RealCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException {
        return null;
    }
}
