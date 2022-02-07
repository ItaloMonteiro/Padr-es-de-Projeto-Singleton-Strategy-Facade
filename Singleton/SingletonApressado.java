public class SingletonApressado {
  //singleton cria uma instância dele mesmo
    private static SingletonApressado instancia = new SingletonApressado();//diferente do singletonLazy esse ja vem instanciado e quando alguem chamar irá retorna uma instância já instanciada 
    //para que ninguem instancie esse padrão de projeto o construtor tem que ser privado
    private SingletonApressado(){
      super();
    }
    //para retornar algo do singleton criarei um metodo publico
    public static SingletonApressado getInstancia(){
      return instancia;
    }
}