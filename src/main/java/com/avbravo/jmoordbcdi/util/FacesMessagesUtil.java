/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmoordbcdi.util;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author avbravo
 */
public class FacesMessagesUtil {
    private static void display(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public static void showInfo(String message, String title) {
      display(FacesMessage.SEVERITY_INFO, message, title);
    }

    public static void showWarn(String message, String title) {
       display(FacesMessage.SEVERITY_WARN, message, title);
    }

    public static void showError(String message, String title) {
        display(FacesMessage.SEVERITY_ERROR, message,  title);
    }

    public static void showSticky(String message, String title) {
        FacesContext.getCurrentInstance().addMessage("sticky-key", new FacesMessage(FacesMessage.SEVERITY_INFO, message, title));
    }

   

}
