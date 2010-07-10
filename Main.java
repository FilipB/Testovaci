/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.management.FileSystem;

/**
 *
 * @author filip
 */
 public class Main {
    private int privatniInt;
    public int publicInt;
    public enum Day {jedna, dv , tri}
    public Day d;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            BufferedReader in = null;
            PrintWriter out = null;
            InputStreamReader cin = null;
            for (String string : args) {
                System.out.println(string);
            }
            Regular rg = new Regular();
            rg.najdi("a{2,3}", "aaaaa");
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            };
            new NewInterface() {

                public String test() {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            };

    }

    private static void ruznyPocet(Object... o){
        System.out.println("delka: "+o.length);
    }
    private  int zmena(TestovaciTrida ts){
        Main.ruznyPocet();
        ts.neco=10;
        ts.neco2=2;
   
        new Inner();
         for(Day dd : d.values()){

       }
        return 10;
    }
    public static class StaticNested extends Dite{
        public StaticNested(){
            super(1);
            System.out.println("Staticnestetd");
        }
        public void delejNeco(){
            System.out.println("SNdelejNeco");


        }
        public static void delejNecoStat(){
            System.out.println("SNdelejNeco");

        }
        
    }
    public  class Inner extends Dite{
        public Inner(){
            super(1);
            System.out.println("Inner");
        }
        public void delejIner(){
            privatniInt=0;


        }

        
    }


}
