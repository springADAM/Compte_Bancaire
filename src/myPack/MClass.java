package myPack;

import javax.swing.*;

public class MClass {
    public static void main(String[] args) {


        Client c = new Client(JOptionPane.showInputDialog(null,"Entrer Votre Nom : "),JOptionPane.showInputDialog(null,"Entrer votre prenom : "));
        c.CreerCompte(JOptionPane.showInputDialog(null,"Entrer  Votre type de compte"),Integer.parseInt(JOptionPane.showInputDialog(null,"votre Sold :")));


    }
}
