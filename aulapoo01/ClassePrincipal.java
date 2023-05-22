package aulapoo01; 

public class ClassePrincipal {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Vermelho";
        c1.marca = "Cis";
        c1.Escrever();
        
        Carro cr1 = new Carro();
        cr1.cor = "Azul";
        cr1.marca = "Porsher";
        cr1.Ligar();
        
        Pessoa pes = new Pessoa();
        pes.nome = "Larissa";
        pes.naci = "Brasileira";
        pes.Falar();
        
        Fornecedor ford = new Fornecedor();
        ford.prod = "Detergente"; 
        ford.marca = "Ypê"; 
        ford.Fornecer();
        
        Professor prof= new Professor();
        prof.nome = "João Victor";
        prof.materia = "POO";
        prof.Ensinar();
                
        Produto prode = new Produto();
        prode.tipo = "Cadernos";
        prode.marca = "Capricho";
        prode.SeVende();
        
    }// Larissa Rocha - 2ºI    Layane Lino - 2ºI
}
