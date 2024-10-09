package com.august.mallcopy.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FlagValidatorClass implements ConstraintValidator<FlagValidator, Integer> {
    private String[] values;

    @Override
    public void initialize(FlagValidator constraintAnnotation) {
        this.values = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        if(value == null){
            return true;
        }
        for (int i = 0; i < values.length; i++) {
            if(value.equals(values[i])){
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
