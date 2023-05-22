
package aulapoo01;

import javax.swing.JOptionPane;

public class Carro {
    //Atributos
    public String  cor;
    protected String marca;
    
    //Métodos
    public void Ligar() {
        JOptionPane.showMessageDialog(null,"Farol ligado!\n"+ this.cor + "\n" + this.marca);
    } 
}// Larissa Rocha - 2ºI    Layane Lino - 2ºI

