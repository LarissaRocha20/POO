
package aulapoo01;

import javax.swing.JOptionPane;

public class Caneta {
    //Atributos
    public String cor;//Todo mundo
    private int ponta;//Mesma classe
    protected String marca;//Mesmo pacote
    
    //Métodos
    public void Escrever(){
        JOptionPane.showMessageDialog(null,"Escreveu!!!\n" + this.cor + "\n" + this.marca);
    }
}// Larissa Rocha - 2ºI    Layane Lino - 2ºI

