/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

/**
 *
 * @author franc
 */

    public class ErrorObjeto extends Exception {
    public ErrorObjeto(String s) {
        super(s + ". No se pueden crear mas de tres clases");
    }
    }
