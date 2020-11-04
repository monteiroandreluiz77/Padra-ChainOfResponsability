package ChainOfResponsability;

public class ConstruirAcessorios extends BicicletaCoR{
    
    public ConstruirAcessorios(){
        super(FaseBicicleta.faseAcessorios);
    }
    
    @Override
    protected void construirBike() {
        System.out.println("Acessorios disponiveis");
    }
}
