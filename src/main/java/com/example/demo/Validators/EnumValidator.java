package com.example.demo.Validators;

public enum EnumValidator {

    NAME("[a-z A-z]{3,}", "err_code", "Imię jest za krótkie"),
    SURNAME("[a-z A-z]{2,}", "err_code", "Nazwisko jest za krótkie"),
    EMAIL("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$","err_code","To nie jest email"),
    PASSWORD("[a-z A-z]{5,}", "err_code", "Hasło musi zawierać co najmniej 6 znaków"),
    CONFIRMPASSWORD("[a-z A-z]{5,}", "err_code", "Hasło musi zawierać co najmniej 6 znaków");

    private String pattern;
    private String errCode;
    private String errMessage;

    EnumValidator(String pattern, String errCode, String errMessage) {
        this.pattern = pattern;
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
