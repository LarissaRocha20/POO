
package aulapoo2;

import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.setCor("Vermelho");
        c1.setPot(230);
        c1.setNome("Fiat");
        JOptionPane.showMessageDialog(null, "Cor: " + c1.getCor() + "\nPotência: " + c1.getPot() + "\nNome: " + c1.getNome());
        
        Caneta c2 = new Caneta();
        c2.setCor("Roxo");
        c2.setPonta(0.7);
        c2.setTamanho(2.2f);
        JOptionPane.showMessageDialog(null, "Cor: " + c2.getCor() + "\nPonta: " + c2.getPonta() + "\nTamanho: " + c2.getTamanho());
        
        Pessoa c3 = new Pessoa();
        c3.setIdade(16);
        c3.setNaci("Brasileiro");
        c3.setNome("Luana");
        JOptionPane.showMessageDialog(null, "Nome: " + c3.getNome() + "\nNacionalidade: " + c3.getNaci() + "\nIdade: " + c3.getIdade());
        
        Microondas c4 = new Microondas();
        c4.setFormato("Retângulo");
        c4.setCapacidade(5);
        c4.setTamanho("Grande");
        JOptionPane.showMessageDialog(null, "Formato: " + c4.getFormato() + "\nCapacidade: " + c4.getCapacidade() + "\nTamanho: " + c4.getTamanho());
        
        Elevador c5 = new Elevador();
        c5.setCapacidade(5);
        c5.setModelo("Hidráulico");
        c5.setTamanho(20);
        JOptionPane.showMessageDialog(null, "Capacidade: " + c5.getCapacidade() + "\nModelo: " + c5.getModelo() + "\nTamanho: " + c5.getTamanho());

        Televisao c6 = new Televisao();
        c6.setMarca("Samsung");
        c6.setTamanho(20);
        c6.setCor("Preta");
        JOptionPane.showMessageDialog(null, "Cor: " + c6.getCor() + "\nMarca: " + c6.getMarca() + "\nTamanho: " + c6.getTamanho());

    }
}// Larissa Rocha - Nº 23
    
