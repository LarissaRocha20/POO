package aulapoo01;

import javax.swing.JOptionPane;

public class Pessoa {
    //Atributos
    public String nome;
    protected String naci;
    
    //Métodos
    public void Falar(){
        JOptionPane.showMessageDialog(null, "Me amoo!\n" + this.nome + "\n" + this.naci);
    }
}// Larissa Rocha - 2ºI    Layane Lino - 2ºI

