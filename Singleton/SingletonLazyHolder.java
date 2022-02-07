//esse é o singleton mais seguro

public class SingletonLazyHolder {
  //singleton cria uma instância dele mesmo
    //esse "holder" tem a função de encapslar esta instancia.
    private static class Holder{
      public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    //para que ninguem instancie esse padrão de projeto o construtor tem que ser privado
    private SingletonLazyHolder(){
      super();
    }
    //para retornar algo do singleton criarei um metodo publico
    public static SingletonLazyHolder getInstancia(){
      //ao inves de acessar a instancia direto, sempre acessará pelo holder
      return Holder.instancia;
    }
}