package calculonotas02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoNotas02 {
    private static final List<Aluno> listaAlunos = new ArrayList<>();
    static public int codigo = 0;
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int opcao;
       float n1, n2, n3, n4;
       do{
            System.out.println("------- Menu Principal -------");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Ver todos os alunos");
            System.out.println("3 - Atualizar dados");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Encerrar programa");
            System.out.print("Informe a operação desejada: ");
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    String nome = teclado.next();
                    System.out.print("Informe a nota 1: ");
                    n1 = teclado.nextFloat();
                    System.out.print("Informe a nota 2: ");
                    n2 = teclado.nextFloat();
                    System.out.print("Informe a nota 3: ");
                    n3 = teclado.nextFloat();
                    System.out.print("Informe a nota 4: ");
                    n4 = teclado.nextFloat();
                    Aluno novoAluno = new Aluno(codigo, nome, n1, n2, n3, n4);
                    listaAlunos.add(novoAluno);
                    codigo++;//incrementa o código
                    break;
                case 2:
                    if (listaAlunos.size() == 0) {
                    System.out.println("Não existem alunos cadastrados");
                    } else {
                        for (Aluno a : listaAlunos) {
                            System.out.println("Código    : " + Integer.toString(a.getCodigo()));
                            System.out.println("Nome      : " + a.getNome());
                            System.out.println("Nota 1    : " + Float.toString(a.getNota1()));
                            System.out.println("Nota 2    : " + Float.toString(a.getNota2()));
                            System.out.println("Nota 3    : " + Float.toString(a.getNota3()));
                            System.out.println("Nota 4    : " + Float.toString(a.getNota4()));
                            System.out.println("Média     : " + Float.toString(a.getMedia()));
                            System.out.println("Situação  : " + a.getSituacao());
                            System.out.println("------------------------------------------------------");
                        }
                    }
                    break;
                case 3:
                    int c = 0;
                    if (listaAlunos.size() == 0) {
                    System.out.println("Não existem alunos cadastrados");
                    } else {
                        System.out.print("Informe um código: ");
                        c = teclado.nextInt();
                        for (Aluno a : listaAlunos) {
                            if (a.getCodigo() == c) {
                                System.out.println("Informe 0 para atualizar nome");
                                System.out.println("Informe 1 para atualizar notas");
                                System.out.print("Informe uma opção: ");
                                int o = teclado.nextInt();
                                if (o == 0){
                                    System.out.print("Informe um novo nome: ");
                                    String n = teclado.next();
                                    a.setNome(n);
                                    break;
                                }else if(o == 1){
                                    System.out.print("Informe a nota 1: ");
                                    n1 = teclado.nextFloat();
                                    System.out.print("Informe a nota 2: ");
                                    n2 = teclado.nextFloat();
                                    System.out.print("Informe a nota 3: ");
                                    n3 = teclado.nextFloat();
                                    System.out.print("Informe a nota 4: ");
                                    n4 = teclado.nextFloat();
                                    a.cadastraNotas(n1, n2, n3, n4);
                                    break;
                                }else{
                                    System.out.println("Opção inválida.");
                                    break;
                                }                            
                            }/*else{
                                System.out.println("Código inválido.");                             
                            }*/
                        }                        
                    }
                    break;
                case 4:
                    c = 0;
                    if (listaAlunos.size() == 0) {
                        System.out.println("Não existem alunos cadastrados");
                    } else {
                        System.out.print("Informe um código: ");
                        c = teclado.nextInt();
                        for (Aluno a : listaAlunos) {
                            //System.out.println("Get código: "+a.getCodigo());
                            if (a.getCodigo() == c) {
                                nome = a.getNome();
                                listaAlunos.remove(a);
                                System.out.println("Aluno "+nome+" removido com sucesso.");
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");                           
               
            }           
       }while(opcao != 5);       
    }
    
}
