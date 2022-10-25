public class Testes {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNome("André");
    cliente.setCpf("145.365.982-04");
    cliente.setIdade(34);
    System.out.println(cliente.retornaStatus("André", "145.365.982-04", null));

    }
}
