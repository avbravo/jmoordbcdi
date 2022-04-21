/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmoordbcdi;

import jakarta.enterprise.inject.spi.InjectionPoint;
import jakarta.ws.rs.Produces;
import java.util.logging.Logger;

/**
 *
 * @author avbravo
 */
public class Loggers {
     @Produces Logger getLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger( injectionPoint.getMember().getDeclaringClass().getSimpleName() );
    }
}
