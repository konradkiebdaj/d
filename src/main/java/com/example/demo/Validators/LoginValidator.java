package com.example.demo.Validators;

import com.example.demo.Models.LoginUser;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return LoginUser.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        LoginUser loginUser = (LoginUser) object;

        validate(EnumValidator.EMAIL, loginUser.getEmail(), "email", errors);
        validate(EnumValidator.PASSWORD, loginUser.getPassword(), "password", errors);

    }

    private void validate(EnumValidator validator, String value, String fieldName, Errors errors) {

        String patternReg = validator.getPattern();
        Pattern pattern = Pattern.compile(patternReg);
        Matcher matcher = pattern.matcher(value);

        if (!matcher.matches()) {
            errors.rejectValue(fieldName, validator.getErrCode(), validator.getErrMessage());
        }
    }
}
