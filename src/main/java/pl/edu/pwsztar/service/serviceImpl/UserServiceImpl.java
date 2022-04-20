package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.RegisterUserDto;
import pl.edu.pwsztar.domain.dto.ResponseData;
import pl.edu.pwsztar.domain.forms.RegisterFormFields;
import pl.edu.pwsztar.domain.validators.*;
import pl.edu.pwsztar.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public ResponseData registerUser(RegisterUserDto registerUserDto) {

        ResponseData responseData = new ResponseData();

        if(!LoginValidator.isValid(registerUserDto.getLogin())) {
            responseData.addErrorFieldName(RegisterFormFields.LOGIN.fieldName());
        }

        if(!FirstNameValidator.isValid(registerUserDto.getFirstName())) {
            responseData.addErrorFieldName(RegisterFormFields.FIRST_NAME.fieldName());
        }

        if(!LastNameValidator.isValid(registerUserDto.getLastName())) {
            responseData.addErrorFieldName(RegisterFormFields.LAST_NAME.fieldName());
        }

        if(!PasswordValidator.isValid(registerUserDto.getPassword())) {
            responseData.addErrorFieldName(RegisterFormFields.PASSWORD.fieldName());
        }

        if(!PeselValidator.isValid(registerUserDto.getPesel())) {
            responseData.addErrorFieldName(RegisterFormFields.PESEL.fieldName());
        }

        return responseData;
    }

}
