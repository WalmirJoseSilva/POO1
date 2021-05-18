package ultracombate;

import java.util.Random;

/**
 * @author WALMIR
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int roudes;
    private boolean aprovado;
    // Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void Lutar(){
        if (this.aprovado){
        System.out.println(" ### DESAFIADO ### ");
        this.desafiado.apresentar();
        System.out.println(" ### DESAFIANTE ### ");
        this.desafiante.apresentar();
        
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);//0 1 2
        System.out.println("=======RESULTADO DA LUTA=========");
        switch(vencedor){
            case 0: //Empate
               System.out.println("Empatou ");
               this.desafiado.empatarLuta();
               this.desafiante.empatarLuta();
                break;
            case 1: //Desafiado vence
                System.out.println("Vitoria do " + desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2: // Desafiante vence
                System.out.println("Vitoria do " + desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }
        System.out.println("=================================");
        }else{
            System.out.println(" A luta não pode acontecer! ");
        }
    }
    
    //Metodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRoudes() {
        return roudes;
    }

    public void setRoudes(int roudes) {
        this.roudes = roudes;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
