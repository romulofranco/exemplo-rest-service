/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsul.romulo.webservice.rest;


public class Greeting {

    private String message;

    Greeting() {

    }

    public Greeting(String name) {
        this.message = getGreeting(name);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String name) {
        this.message = name;
    }

    private String getGreeting(String name) {
        return "Hello " + name;
    }
}
