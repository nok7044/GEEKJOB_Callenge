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
public class Main1 {
    public static void main(String[] args){
        //Class1クラスのインスタンス生成
        Class1 hito = new Class1();
        //hitoインスタンスのsetProfileを利用してname,age,addressフィールドへ設定
        hito.setProfile("佐藤",23,"千葉");
        //Class1インスタンスのprintProfileを呼び出す
        hito.printProfile();
    }
}
