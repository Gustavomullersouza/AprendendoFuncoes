public class Main {
    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("Valor soma " + somaViaFuncao);

        int subtrairValores = subtrairValores(-50, 30);
        System.out.println(subtrairValores);

        int multiplicarValores = multiplicarValores(3, 5);
        System.out.println(multiplicarValores);

        int dividirValores = dividirValores(10, 2);
        System.out.println(dividirValores);


    }

    public static int somarValores(int numA, int numB) {
        return numA + numB;
    }

    public static int subtrairValores(int numA, int numB) {
        if (numA < 0) {
            numA = numA * -1;
        }

        return numA - numB;
    }

    public static int multiplicarValores(int numA, int numB) {
        return numA * numB;
    }

    public static int dividirValores(int numA, int numB) {
        return numA / numB;
    }


}