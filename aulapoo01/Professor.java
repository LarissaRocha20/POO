package aulapoo01;

import javax.swing.JOptionPane;

public class Professor {
    //Atributos
    public String  nome;
    protected String materia;
    
    //Métodos
    public void Ensinar() {
        JOptionPane.showMessageDialog(null,"Ensinando!\n"+ this.nome + "\n" + this.materia);
    } 
    // Larissa Rocha - 2ºI    Layane Lino - 2ºI
}
