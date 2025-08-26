public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00");
        pf.exibirInformacoes();
        System.out.println("CPF válido: " + pf.validarCpf());
        System.out.println();

        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "12.345.678/0001-90");
        pj.setNomeFantasia("XYZ Comércio");
        pj.exibirInformacoes();
        System.out.println("CNPJ válido: " + pj.validarCnpj());
    }
}