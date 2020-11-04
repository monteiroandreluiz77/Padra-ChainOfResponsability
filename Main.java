package ChainOfResponsability;

public class Main {

	public static void main(String[] args) throws Exception {
        BicicletaCoR bicicleta = new ConstruirRodas(); 
        bicicleta.setNext(new ConstruirChassi());
        bicicleta.setNext(new ConstruirAcessorios());
        
        	System.out.println("Bicicleta está pronta:\n");
            bicicleta.montarBike(BicicletaCoR.FaseBicicleta.faseRodas);
            bicicleta.montarBike(BicicletaCoR.FaseBicicleta.faseChassi);
            bicicleta.montarBike(BicicletaCoR.FaseBicicleta.faseAcessorios);
    
    }
    
}
