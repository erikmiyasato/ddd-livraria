public class Receita {
    String nomeReceita;
    String autorReceita;
    String ingredientes;
    int tempoPreparo;
    String dificuldade;
    int porcoes;
    String descricao;
    String modoPreparo;

    public void exibirReceita () {
        System.out.println("Receita de " + nomeReceita);
        System.out.println("========================");
        System.out.println("Publicado por:" + autorReceita);
        System.out.println(dificuldade + "\t\t\t\t" + tempoPreparo + "\t\t\t\t" + porcoes);
        System.out.println(descricao);
        System.out.println("Ingredientes\n" + ingredientes);
        System.out.println("Modo de Preparo\n" + modoPreparo);
    }
        //Método com retorno
    public String exibirReceita2(){
            String mensagem = "Receita de " + nomeReceita +
                "\n========================" +
                        "\nPublicado por: " + autorReceita +
                    dificuldade + "\t\t\t\t" + tempoPreparo + "\t\t\t\t" + porcoes +
                    descricao
                    ;
            return mensagem;
        }


}
