package ChainOfResponsability;

public class ConstruirRodas extends BicicletaCoR{

    public ConstruirRodas(){
        super(FaseBicicleta.faseRodas);
    }
    
    @Override
    protected void construirBike() {
        System.out.println("Rodas estao prontas.");
    }
    
}
