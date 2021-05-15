

public class trocarMarcha {
    
    public int cambio;
    public int posicao;
    
    public void setCambio(int marcha){
        this.cambio = posicao;
    }
    
    public void setposicao(int pos) {
        if(posicao >=0 && posicao <=5){
            this.posicao = pos;
        }
    }
    
    public int getcambio() {
        System.out.println("FAZER TROCA DE MARCHA ");
        return this.cambio;
        
    }
}

