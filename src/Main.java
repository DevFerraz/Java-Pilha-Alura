public class Main {
    public static void main(String[] args) {
        System.out.println("Início do Main");
        Cliente cliente1 = new Cliente("Marcos Silva", "017.985.654-19", 42);
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + ex);
            ex.printStackTrace();
            System.out.println(cliente1.getNome());
            System.out.println(cliente1.retornaStatus("Marcos Silva", "017.985.654-19", 42));
        }
        System.out.println("Fim do Main");
    }

    private static void metodo1() {
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    private static void metodo2() {
        System.out.println("Início do método 2");
        if (5 - 4 == 1) {
            throw new ArithmeticException("Problema de compilação");
        } else return;
    }
}