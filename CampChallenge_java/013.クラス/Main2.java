/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author satou.pecotan
 */
public class Main2 {
    public static void main(String[] args){
        Class2 hito = new Class2();
        hito.setProfile("斎藤",22,"東京");
        hito.printProfile();
        //フィールドの値をクリア
        hito.clearProfile();
        hito.printProfile();
    }
}
