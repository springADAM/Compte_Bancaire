package myPack;

import javax.swing.*;
import java.util.ArrayList;

public class Client {
    private String nom ,prenom ;
    private ArrayList<Compte> cmp  = new ArrayList<>();

    public Client(String nom,String prenom ){
        this.nom = nom;
        this.prenom= prenom ;
    }
    public void CreerCompte(String Type, int Sold  ){
        if(cmp.size()<2){if (Type.equals("dinnar")){
            if ( Sold  >= 20000){
                cmp.add(new Compte(Type,Sold));
            }else  while(Sold < 20000) {
                Sold = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrer un montant plus ou egale a 20000 da"));
            }
        }else{
            if ( Sold>= 1000){
                cmp.add(new Compte(Type,Sold));
            }else JOptionPane.showMessageDialog(null,"Impossible");
        }
            cmp.add(new Compte(Type,Sold));
        }else JOptionPane.showMessageDialog(null,"Impossible");
    }
}
