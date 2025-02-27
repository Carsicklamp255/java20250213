
package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Exemplos!");
        
        SoDados sd = new SoDados();
        sd.i= 10;
        sd.f = 100;
        sd.b = true;
        
        SoDados x = new SoDados();
        x.i= 20;
        x.f = 200;
        x.b = false;
        
        sd.imprimir();
    }
}
