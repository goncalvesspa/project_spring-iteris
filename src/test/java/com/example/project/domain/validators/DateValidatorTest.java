 package com.example.project.domain.validators;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import javax.validation.ConstraintValidatorContext;

import java.sql.Date;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * PhoneValidatorTest
 */
@RunWith(MockitoJUnitRunner.class)
public class DateValidatorTest {

    @Mock
    ConstraintValidatorContext constraintValidatorContext; 

    DateValidator dateValidator;

    @Before
    public void setUp() {

         dateValidator = new DateValidator();

    }

    @Test
    public void should_NotBeValid_WhenNotNumber(){
        assertTrue(dateValidator.isValid(new Date(0), constraintValidatorContext));

         //Calendar hoje = Calendar.getInstance();
       //hoje.getTime()
    }

    @Test
    public void should_NotBeValid_When7digits() {
        assertTrue(dateValidator.isValid(new Date(21/02/2020), constraintValidatorContext));
    } 
 
}


    /* DateValidator validator = new DateValidatorUsingDateFormat("MM/dd/yyyy");
 
    assertTrue(validator.isValid("02/28/2019"));        
    assertFalse(validator.isValid("02/30/2019")); */


   /*  @Test
    public void should_NotBeValid_WhenNotNumber() {
        assertFalse(dateValidator.isValid("String phone", constraintValidatorContext));
    } 
    @Test
    public void should_NotBeValid_When7digits() {
        assertFalse(dateValidator.isValid("21/02/2020", constraintValidatorContext));
    }

    @Test
    public void should_BeValid_When9digits() {
        assertTrue(phoneValidator.isValid("987654321", constraintValidatorContext));
    }

    @Test
    public void should_BeValid_When11digits() {
        assertTrue(phoneValidator.isValid("11987654321", constraintValidatorContext));
    }
 */

//}