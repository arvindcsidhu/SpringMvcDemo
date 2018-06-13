package com.springmvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({
	ElementType.METHOD,ElementType.FIELD
})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "LUV";
	
	public String message() default "Message must start with LUV";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};

}
