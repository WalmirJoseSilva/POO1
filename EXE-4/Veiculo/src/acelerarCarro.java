
public class acelerarCarro {
    
    
    private int posicao;
    private double ligado;
    private int verdadeiro;
    
    public void acelerar(){
        if(ligado == verdadeiro && posicao < 120)  {
           System.out.println(" ACELERANDO... ");
           posicao += 10;
        } 
    }
    
    public void frear(){
        if (posicao > 0){
            System.out.println(" FREIANDO... ");
            posicao -= 10;   
        } 
    }
    
    
    public int getVelocidade(){
        return posicao;
    }
}

