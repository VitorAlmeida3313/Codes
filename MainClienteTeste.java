import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Cliente c = new Cliente();

        int menu; 

        do {
            System.out.println("------------MENU------------\n");
            System.out.println("1- Cadastrar Usuário" + "\n2- Alterar dados do usuário" + "\n3- Exibir Usuário" + "\n4- Sair");
            menu = scn.nextInt();
            scn.nextLine(); 
            System.out.println("----------------------------\n");

            switch (menu) {
                case 1: 
                    while (true) {
                        System.out.println("Escolha um espaço de armazenamento (Digite 1 para espaço 1 ou 2 para o espaço 2): ");
                        int espaco = scn.nextInt();
                        scn.nextLine();  

                        if (espaco != 1 && espaco != 2) {
                            System.out.println("\nDigite um espaço de armazenamento válido!");
                            System.out.println("----------------------------\n");
                        } else {
                            if (espaco == 1) {

                                System.out.println("----------------------------\n");
                                System.out.print("Digite seu CPF: ");
                                String cpf = scn.nextLine();
                                c.setCPF1(cpf);

                                System.out.print("\nDigite seu nome: ");
                                String nome = scn.nextLine();
                                c.setNOME1(nome);

                                System.out.print("\nDigite sua idade: ");
                                int idade = scn.nextInt();
                                scn.nextLine();
                                c.setIDADE1(idade);

                            } else {
                                System.out.println("----------------------------\n");

                                System.out.print("Digite seu CPF: ");
                                String cpf = scn.nextLine();
                                c.setCPF2(cpf);

                                System.out.print("\nDigite seu nome: ");
                                String nome = scn.nextLine();
                                c.setNOME2(nome);

                                System.out.print("\nDigite sua idade: ");
                                int idade = scn.nextInt();
                                scn.nextLine();
                                c.setIDADE2(idade);
                            }
                            break; 
                            
                        }
                        
                    }
                    System.out.println("----------------------------\n");
                    break;
                    
                case 2: 
                    while (true) {
                        
                    
                    System.out.println("Qual usuário deseja alterar?" + "\n1- Usuário 1" + "\n2- Usuário 2");
                    int usuario = scn.nextInt();
                    scn.nextLine();  
                    
                    
                    if (usuario != 1 && usuario != 2) {
                        System.out.println("\nDigite um usuário válido!");

                    }else{
                        System.out.println("----------------------------\n");
                        System.out.println("O que deseja alterar?" + "\n1- CPF" + "\n2- Nome" + "\n3- Idade" + "\n4- Tudo");
                        int alterar = scn.nextInt();
                        scn.nextLine();  

                        switch (alterar) {
                            case 1:
                                System.out.println("----------------------------\n");
                                System.out.print("Digite o novo CPF: ");
                                String cpf = scn.nextLine();
                                if (usuario == 1) {
                                    c.setCPF1(cpf);
                                } else {
                                    c.setCPF2(cpf);
                                }
                                System.out.println("\nCPF alterado com sucesso!");
                                System.out.println("----------------------------\n");
                                break;
                            case 2:
                                System.out.println("----------------------------\n");
                                System.out.print("\nDigite o novo nome: ");
                                String nome = scn.nextLine();
                                if (usuario == 1) {
                                    c.setNOME1(nome);
                                } else {
                                    c.setNOME2(nome);
                                }
                                System.out.println("\nNome alterado com sucesso!");
                                System.out.println("----------------------------\n");
                                break;
                            case 3:
                                System.out.println("----------------------------\n");
                                System.out.print("\nDigite a nova idade: ");
                                int idade = scn.nextInt();
                                if (usuario == 1) {
                                    c.setIDADE1(idade);
                                } else {
                                    c.setIDADE2(idade);
                                }
                                System.out.println("\nIdade alterada com sucesso!");
                                System.out.println("----------------------------\n");
                                break;
                            case 4:
                                System.out.println("----------------------------\n");
                                System.out.print("Digite o novo CPF: ");
                                cpf = scn.nextLine();
                                if (usuario == 1) {
                                    c.setCPF1(cpf);
                                } else {
                                    c.setCPF2(cpf);
                                }

                                System.out.print("\nDigite o novo nome: ");
                                nome = scn.nextLine();
                                if (usuario == 1) {
                                    c.setNOME1(nome);
                                } else {
                                    c.setNOME2(nome);
                                }

                                System.out.print("\nDigite a nova idade: ");
                                idade = scn.nextInt();
                                if (usuario == 1) {
                                    c.setIDADE1(idade);
                                } else {
                                    c.setIDADE2(idade);
                                }
                                System.out.println("\nDados alterados com sucesso!");
                                System.out.println("----------------------------\n");
                                break;
                                
                        }
                        break;
                    
                    
                    }
                    
                }
                break;
                
                case 3: 
                    while (true) {
                        System.out.println("Qual usuário deseja exibir?" + "\n1-Usuário 1" + "\n2-Usuário 2");
                    int exibir = scn.nextInt();
                    scn.nextLine();  
                    if (exibir != 1 && exibir !=2) {
                        System.out.println("Digite um usuário válido");
                        System.out.println("\n----------------------------\n");
                    }else if (exibir == 1) { 
                        System.out.println("-----------USUÁRIO 1--------\n");
                        System.out.println(c.imprimir1());
                        break;
                    } else if (exibir == 2) {
                        System.out.println("-----------USUÁRIO 2--------\n");
                        System.out.println(c.imprimir2());
                        break;
                    } 
                    
                    }
                    System.out.println("----------------------------\n");
                    break;
                   
                    

                case 4: 
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    System.out.println("----------------------------\n");
                    
            }
        } while (menu != 4);

        scn.close();
    } 
}

