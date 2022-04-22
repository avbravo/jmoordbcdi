/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.avbravo.jmoordbcdi.type;

/**
 *
 * @author avbravo
 * Se usa para FechType. Carga de datos
 * LAZY  --> Las referencias solo se cargan cuando se usa el metodo get
 * EAGER --> Carga todas las referencias en cada consulta
 */
public enum DocumentFechType {
    LAZY, 
    EAGER;
}
