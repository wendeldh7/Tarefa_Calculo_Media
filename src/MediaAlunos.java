public class MediaAlunos {
    /**
     * Neste código, utilizamos a classe int para ler as notas inseridas pelo usuário. Em seguida, as quatro notas são somadas e divididas por 4 para calcular a média. Por fim, a média é impressa no console.
     *
     * Você pode executar esse código e testá-lo com diferentes valores de notas para obter as médias correspondentes.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Informe as quatro notas dos alunos:");
        double nota1 = 5;
        double nota2 = 6;
        double nota3 = 7;
        double nota4 = 8;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média dos alunos é: " + media);
    }
}