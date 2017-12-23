/*
 * Created on 3 avr. 2014 ( Time 19:39:49 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package org.demo.bean;

import java.io.Serializable;

import javax.validation.constraints.*;


public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    @Size( min = 1, max = 2 )
    private String code;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Size( max = 45 )
    private String name;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setCode( String code ) {
        this.code = code ;
    }

    public String getCode() {
        return this.code;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(code);
        sb.append("|");
        sb.append(name);
        return sb.toString(); 
    } 


}
