
package aulapoo01;

import javax.swing.JOptionPane;

public class Produto {
    //Atributos
    public String tipo;
    protected String marca;
    
    //Métodos
    public void SeVende(){
        JOptionPane.showMessageDialog(null, "Vendendo!\n" + this.tipo + "\n" + this.marca);
    }
}// Larissa Rocha - 2ºI    Layane Lino - 2ºI

