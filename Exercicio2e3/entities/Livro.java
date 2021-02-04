package Exercicio2e3.entities;

public class Livro extends Produto implements Imposto{

    private String autor;
    private String tema;
    private int quantPaginas;

    public Livro() {
        this("", 0.0, 0, "", "", 0);

    }

    public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantPaginas) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.tema = tema;
        this.quantPaginas = quantPaginas;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }

    public void setQuantPaginas(int quantPaginas) {
        this.quantPaginas = quantPaginas;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0.0;

        if (this.tema.equalsIgnoreCase("Educativo")) {
            imposto = 0.0;
            System.out.println("Livros educativos não pagam Impostos");
        }

        imposto = super.getPreco() * 0.10;
        System.out.println("O imposto do livro " + super.getNome() + " é de R$ " + String.format("%.2f", imposto));



        return imposto;
    }


}
