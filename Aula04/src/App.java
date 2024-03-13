public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Aluno larissa = new Aluno ("Larissa", "000.000.000-00",292048, "16/07/1983", "Feminino");
        larissa.setNome("Larissa");

        System.out.println(larissa.getNome());
        System.out.println(larissa.getRa());
        
        Aluno a = new Aluno ();
        a.setNome("Vanessa");
        System.out.println(a.getNome());

    }
}
