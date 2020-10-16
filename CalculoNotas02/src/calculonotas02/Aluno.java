package calculonotas02;
public class Aluno {
    //declaração dos atributos da classe
    private int codigo;
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media;
    private String situacao; 
    
    // situacao = atributo, situacao() = método
    
    //método construtor, deve ter o mesmo nome da classe
    public Aluno(int c, String n, float n1, float n2, float n3, float n4){
        this.setCodigo(c);
        this.setNome(n);
        this.setNota1(n1);
        this.setNota2(n2);
        this.setNota3(n3);
        this.setNota4(n4);
        this.calculaMedia();
    }
    
    //método de estado
    public void status(){
        System.out.println("-----------------------");
        System.out.println("Aluno: "+this.getNome());
        System.out.println("Nota 1: "+this.getNota1());
        System.out.println("Nota 2: "+this.getNota2());
        System.out.println("Nota 3: "+this.getNota3());
        System.out.println("Nota 4: "+this.getNota4());
        System.out.println("Média: "+this.getMedia());
        System.out.println("Situação: "+this.getSituacao());
    }
    
    public void cadastraNotas(float n1, float n2, float n3, float n4){
        this.setNota1(n1);
        this.setNota2(n2);
        this.setNota3(n3);
        this.setNota4(n4);
        this.calculaMedia();
    }
    
    public void calculaMedia(){
        this.media = (this.getNota1()+this.getNota2()+this.getNota3()+this.getNota4())/4;
        this.verificaSituacao();
    }
    
    private void verificaSituacao(){
        if (this.getMedia() >= 7) {
            this.setSituacao("Aprovado");
        } else if(this.getMedia() <7 && this.getMedia() >= 5){
            this.setSituacao("Prova Final");
        }else{
            this.setSituacao("Reprovado");
        }
    }
    
    public int getCodigo() {
        return codigo;    
    }

    //métodos modificadores e acessores
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
