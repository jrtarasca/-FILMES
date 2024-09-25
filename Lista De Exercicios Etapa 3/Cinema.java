import java.util.Scanner;

public class Cinema {

    // Classe interna Filme
    static class Filme {

        // Variáveis de instância
        String titulo;
        String genero;
        int duracao;  

        // Construtor
        public Filme() {
            this.titulo = "";
            this.genero = "";
            this.duracao = 0;
        }

        // Método definir o título
        public void setTitulo() {
            Scanner scann = new Scanner(System.in);
            if (this.titulo.isEmpty()) {
                System.out.println("Digite o nome do filme:");
                this.titulo = scann.nextLine();
            }
        }

        // Método definir o gênero
        public void setGenero() {
            Scanner scann = new Scanner(System.in);
            if (this.genero.isEmpty()) {
                System.out.println("O filme é de romance, terror ou comedia?");
                String inputGenero = scann.nextLine();
                if (inputGenero.equalsIgnoreCase("romance") || 
                    inputGenero.equalsIgnoreCase("terror") || 
                    inputGenero.equalsIgnoreCase("comedia")) {
                    this.genero = inputGenero;
                } else {
                    System.out.println("Gênero inválido!");
                }
            }
        }

        // Método definir a duração em minutos
        public void setDuracao() {
            Scanner scann = new Scanner(System.in);
            if (this.duracao == 0) {
                System.out.println("Digite a duração do filme em minutos:");
                this.duracao = scann.nextInt();
            }
        }

        // Método retornar o nome do filme
        public String getNome() {
            return this.titulo;
        }

        // Método retornar o gênero do filme
        public String getGenero() {
            return this.genero;
        }

        // Método retornar a duração formatada em horas e minutos
        public String getDuracao() {
            int horas = this.duracao / 60;
            int minutos = this.duracao % 60;
            return String.format("%d:%02d", horas, minutos);  //Formato horas:minutos
        }
    }

    // Método principal para execução
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Filme filme = new Filme();  // Cria um novo objeto da classe Filme

        //Atributos do filme
        filme.setTitulo();
        filme.setGenero();
        filme.setDuracao();

        // Exibe os detalhes do filme
        System.out.println("\nNome do filme: " + filme.getNome() +
                           "\nGênero do filme: " + filme.getGenero() +
                           "\nDuração do filme é: " + filme.getDuracao() + "hrs");

        scan.close();
    }
}
