package ChainOfResponsability;

public class ConstruirChassi extends BicicletaCoR{
 
    public ConstruirChassi(){
        super(FaseBicicleta.faseChassi);
    }
    
    @Override
    protected void construirBike() {
        System.out.println("O chassi esta pronto.");
    }
}