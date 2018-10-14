package myPack;

import javax.swing.*;
import java.util.Random;

public class Compte {
    private int Sold ;
    private String Type ;
    private String ndc ="";
 public Compte( String Type,int Sold ){
     for(int i=0;i<8;i++){
         ndc = ndc + new Random().nextInt(9);
     }
     this.Sold=Sold;
     this.Type=Type;
 }
    public int getSold() {
        return Sold;
    }

    public void setSold(int sold) {
        Sold = sold;
    }

    public String getNdc() {
        return ndc;
    }

    public void setNdc(String ndc) {
        this.ndc = ndc;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


    public void deposer (int m){
        Sold += m ;
    }
    public void retirer (int m){
        if (Type.equals("dinnar")){
            if ( Sold - m >= 20000){
                Sold = Sold - m ;
            }else JOptionPane.showMessageDialog(null,"Impossible");
        }else{
            if ( Sold - m >= 1000){
                Sold = Sold - m ;
            }else JOptionPane.showMessageDialog(null,"Impossible");
        }
    }
    public int Consulter (){
        return Sold ;
    }
}
