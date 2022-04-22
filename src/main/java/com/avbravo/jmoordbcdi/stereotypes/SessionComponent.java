/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.jmoordbcdi.stereotypes;

import com.avbravo.jmoordbcdi.Secure;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Stereotype;
import jakarta.inject.Named;
import jakarta.transaction.Transactional;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author avbravo
 */
@Secure
@Transactional
@RequestScoped
@Named
@Stereotype
@Retention(RUNTIME)
@Target(TYPE)
public @interface SessionComponent {
    
}
