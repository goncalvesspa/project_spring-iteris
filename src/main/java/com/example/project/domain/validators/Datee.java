package com.example.project.domain.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = DateValidator.class)
@Documented
public @interface Datee {

    String message() default "Data inválida, deve conter dia, mês e ano em dígitos numéricos.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

	int getTime();

} 