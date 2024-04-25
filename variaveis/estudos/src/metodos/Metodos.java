package metodos;

import java.util.Scanner;

public class Metodos {
    
    public static void main(String[] args) {
        calculadora();        
    }

    public static int somar ( int n1 , int n2) {
         return n1+n2;
    }

    public static int subtrair ( int n1 , int n2) {
        return n1 - n2;
    }

    public static int multiplicar (int n1 , int n2) {
        return n1 * n2;
    }

    public static int dividir ( int n1 , int n2) {
        return n1 / n2 ;
    }

    public static byte verificarOperacao ( byte operacao) {
        return operacao;
    }

    public static void calculadora () {
        System.out.println("---Calculadora--");
        System.out.println("");
        System.out.println("Digite 1 para soma.");
        System.out.println("Digite 2 para subtrair.");
        System.out.println("Digite 3 para subtrair.");
        System.out.println("Digite 4 para dividir.");
        System.out.println("");
        System.out.println("Digite a operação desejada");

        operacao(); // chamada pra guardar  a operação do usuário 
    }

    public static void operacao () {
        
        
        Scanner leitor = new Scanner(System.in);
        int operacaoEscolhida = leitor.nextInt();

        guardarValoresUsuario(operacaoEscolhida);
        
       }

    public static void guardarValoresUsuario( int operacao ) {
        int operacaoRecebida = operacao;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
            int n1 = leitor.nextInt();

       System.out.println("Digite o segundo número:");
            int n2 = leitor.nextInt();  

        realizarOperacao(operacaoRecebida, n1, n2);
            
    }
    
    public static void realizarOperacao( int operacao , int numero1 , int numero2) {
            switch (operacao) {
                case 1:
                    System.out.println(("A soma é = ") + somar(numero1, numero2));
                    System.err.println("--------------------------------------------");
                        operarNovamente();                 
                            break;

                case 2 : 
                    System.out.println(("A subtração é = ") + subtrair(numero1, numero2));
                        System.err.println("--------------------------------------------");                                                 
                        operarNovamente(); 
                            break;

                case 3 :
                    System.out.println( ("A multiplicação é = ") + multiplicar(numero1, numero2));
                    System.err.println("--------------------------------------------");
                        operarNovamente(); 
                            break;

                case 4 :
                    System.out.println(("A divisão é = ") + dividir(numero1, numero2));
                    System.err.println("--------------------------------------------");
                        operarNovamente(); 
                            break;

                default:
                    break;
            }
    }

    public static void  operarNovamente () {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite 1 para fazer outra operação:");
            System.out.println("Qualquer outro numero pra encerrar.");

            int resposta = leitor.nextInt();

            if ( resposta == 1) {
                calculadora();
            } else {
                System.out.println("FIM");
            }


    }



}
