package ChainOfResponsability;

public abstract class BicicletaCoR {
    protected BicicletaCoR avancar; 
    protected FaseBicicleta idBike;
    
    public BicicletaCoR(FaseBicicleta id){
        avancar = null; 
        idBike = id; 
    }
    
    public enum FaseBicicleta{
        faseRodas,
        faseChassi, 
        faseAcessorios;
    }
    
    public void setNext(BicicletaCoR proxima){
        if(avancar == null){ 
            avancar = proxima; 
        }else{
            avancar.setNext(proxima);
        }
    }
    
    public void montarBike(FaseBicicleta id) throws Exception{
        if(podeMontarBike(id)){
            construirBike();
        }else{
            if(avancar == null){
                throw new Exception("Impossivel fazer a bicicleta, verifique a montagem."); 
            }
            avancar.montarBike(id);
        }
    }
    
    private boolean podeMontarBike(FaseBicicleta id){
        if(idBike == id){
            return true; 
        }
        return false; 
    }
    
    protected abstract void construirBike(); 
}