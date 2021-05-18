
package ultracombate;
/**
 *@author WALMIR
 */
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    // Metodos Publicos
    public void apresentar(){
        System.out.println("------------------------------------------------");
        System.out.println
                    ("CHEGOU A HORA! De apresenta o lutador" + this.getNome());
        System.out.println("Diretamente do " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.altura);
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " Vitorias ");
        System.out.println(this.getDerrotas() + " Derrotas ");
        System.out.println(this.getEmpates() + " Empates! ");
    }
    public void status(){
        System.out.println
                    (this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(" Ganhou " + this.getVitorias() + " Vezes");
        System.out.println(" Perdeu " + this.getDerrotas() + " Vezes");
        System.out.println(" Empatou " + this.getEmpates() + " Vezes");
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
      // Metodos Especiais

    public Lutador(String no, String na, int id, float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3){
            this.categoria = "leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Medio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
