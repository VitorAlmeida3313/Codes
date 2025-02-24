import java.util.Scanner;

public class CalculoDeNota {
    public static void main(String[] args) {    
        Scanner scn = new Scanner(System.in);

        double media = 0.0;
        int notaMinima = 0, refazer = 1;

        while (refazer == 1) {

         System.out.println("-----CADASTRO DA FACULDADE-----\n");   

        System.out.print("Digite o nome da sua faculdade: ");
        String faculdade = scn.nextLine().toUpperCase();

            
        System.out.print("\nDigite a nota mínima da " + faculdade + ": ");
        notaMinima = scn.nextInt();
        
        

        System.out.print("\nDigite quantas avaliações tem a " + faculdade + ": ");
        int avaliacao = scn.nextInt();
        String [] atividades = new String[avaliacao];
        double[] peso = new double[avaliacao];
        double[] nota = new double[avaliacao];
        double[] percentual = new double[avaliacao];                        

        System.out.println("\n-------------------------------\n");

        System.out.println("-----CADASTRO DAS AVALIAÇÕES-----");

        for(int i = 0; i < avaliacao; i++){
            System.out.print("\nDigite o nome da " + (i + 1) + "º avaliação da " + faculdade + ": ");
            
            atividades[i] = scn.next().toUpperCase();
            scn.nextLine();
        }

        System.out.println("\n---------------------------------\n");

        System.out.println("-----CADASTRO DE PESOS-----\n");

        for(int i = 0; i < avaliacao; i++){
            while (true) {
                
            
            System.out.print("Digite o peso da " + atividades[i] + ": ");
            peso[i] = scn.nextDouble();
            if (peso[i] >=0 && peso[i] <=100) {
                break;
            }else{
                System.out.println("Os pesos são entre 0 e 100");
            }
        }
            percentual[i] = peso[i] /100.0;
        }

            System.out.println("\n---------------------------\n");
            scn.nextLine();


        do{

            System.out.println("-----CADASTRO DAS NOTAS-----\n");
            media = 0.0;

            System.out.print("Digite o seu nome: ");
            String aluno = scn.nextLine().toUpperCase();

            for(int i = 0; i < avaliacao; i++){
                while (true) {
                System.out.print("Digite a nota da " + atividades[i] + ": ");
                nota[i] = scn.nextDouble();
                if (nota[i] >=0 && nota[i] <=10) {
                    break;
                }else{
                    System.out.println("Digite uma nota entre 0 e 10\n");
                }
            }
                media += nota[i] * percentual[i];
                scn.nextLine();
            }

            System.out.println("\n----------------------------\n");

            System.out.println("-----MÉDIA FINAL-----\n");

            if (media < notaMinima) {
                System.out.println("Aluno: " + aluno + "\nNota Final: " + media + "\nSituação: REPROVADO");
            }else{
                System.out.println("Aluno: " + aluno + "\nNota Final: " + media + "\nSituação: APROVADO");
            }

            System.out.println("\n---------------------\n");


            System.out.println("Deseja realizar um novo calculo de notas ou cadastrar uma nova faculdade? (Para sair digite qualquer número)" + "\n1- Voltar ao início" + "\n2- Calcular média novamente");
            refazer = scn.nextInt();
            scn.nextLine();

        }while(refazer == 2);
        

    }
    scn.close();
    }
} 