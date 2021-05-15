

public class carroLigado {
    
    private boolean  ligado;
    private int velocidade;
    private boolean verdadeiro;
    
    public void iniciar (){
        ligado = false;
        velocidade = 0;
    }
    
    public void ligar(){
        if (ligado == false){
            System.out.println(" LIGADO... ");
        ligado = verdadeiro;
        }
    }
    
    public void desligar(){
        if(ligado == verdadeiro && velocidade == 0){
            System.out.print(" DESLIGADO..  ");
            ligado = false;
        }
    }
   
    public boolean getligado(){
        return ligado;
    }
    
}
