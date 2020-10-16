package calculonotas01;

import java.util.Scanner;

public class CalculoNotas01 {
    public static void main(String[] args) {
        Aluno a = new Aluno("Cleiton");
        //a.status();
        a.cadastraNotas(5, 2.3f, 2.5f, 7);
        
        a.status();
        
        
        //cadastro interativo
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String nome = teclado.next();
        Aluno b = new Aluno(nome);
        b.status();
        System.out.print("Informe a nota 1: ");
        float e = teclado.nextFloat();
        System.out.print("Informe a nota 2: ");
        float f = teclado.nextFloat();
        System.out.print("Informe a nota 3: ");
        float c = teclado.nextFloat();
        System.out.print("Informe a nota 4: ");
        float d = teclado.nextFloat();
        b.cadastraNotas(e, f, c, d);
        b.status();
    }
    
}
