package com.avbravo.jmoordbcdi.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author
 */
@Documented
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
    String database() default "";
    String collecction() default "";
    String document() default "";
    String dateformat() default ("dd/MM/yyyy HH:mm:ss a");

    boolean lazy() default true;
}
