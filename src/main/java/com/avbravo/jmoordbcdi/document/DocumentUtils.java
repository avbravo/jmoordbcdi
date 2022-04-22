/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.jmoordbcdi.document;

import java.lang.reflect.Field;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
public class DocumentUtils {

    // <editor-fold defaultstate="collapsed" desc="<T> Document toDocument(T obj)>

    public static <T> Document toDocument(T obj) throws Exception {
        Document doc = new Document();

        //Get all the fields: get the class object through the getClass () method, and then get all the fields of this class
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            //Open field operation permission
            field.setAccessible(true);
            //Set value
            doc.put(field.getName(), field.get(obj));
        }

        return doc;
    }
        // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="<T> T toObject(Document doc, Class<T> clazz)">
    public static <T> T toObject(Document doc, Class<T> clazz) throws Exception {
        //Instantiating generic objects
        T obj = clazz.newInstance();

        for (String key : doc.keySet()) {
            //Get field
            Field field = clazz.getDeclaredField(key);
            //Open field operation permission
            field.setAccessible(true);
            //Set value
            field.set(obj, doc.get(key));
        }

        return obj;
    }
    // </editor-fold>
}
