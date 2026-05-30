package com.cafe;

import javax.swing.JOptionPane;

public class MaquinaCaffe {

    public static void main(String[] args) {
        
        Cafe cafe = new Cafe("tradicional", 1.00);
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Escolha de 1 à 6"));
        
        cafe.selecionar(num);
        
        
        System.out.println("Hello World!");
    }
}
