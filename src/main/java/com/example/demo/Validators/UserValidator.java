package com.example.demo.Validators;

import com.example.demo.Models.LoginUser;
import com.example.demo.Models.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class UserValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        User user = (User) object;

        validate(EnumValidator.NAME, user.getName(), "name", errors);
        validate(EnumValidator.SURNAME, user.getSurname(), "surname", errors);
        validate(EnumValidator.EMAIL, user.getEmail(), "email", errors);
        validate(EnumValidator.PASSWORD, user.getPassword(), "password", errors);
        validate(EnumValidator.CONFIRMPASSWORD, user.getConfirmPassword(), "confirmPassword", errors);

        String password = user.getPassword();
        String confirmPassword = user.getConfirmPassword();

        if (!password.equals(confirmPassword)){
            errors.rejectValue("confirmPassword", "err_code", "Hasła muszą być takie same");
        }

    }

    private void validate(EnumValidator validator, String value, String fieldName, Errors errors) {
        String patternReg = validator.getPattern();
        Pattern pattern = Pattern.compile(patternReg);
        Matcher matcher = pattern.matcher(value);

        if (!matcher.matches()){
            errors.rejectValue(fieldName, validator.getErrCode(), validator.getErrMessage());
        }
    }
}
