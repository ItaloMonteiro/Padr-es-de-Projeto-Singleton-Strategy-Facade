public class SingletonLazy {
  //singleton cria uma instância dele mesmo
    private static SingletonLazy instancia;
    //para que ninguem instancie esse padrão de projeto o construtor tem que ser privado
    private SingletonLazy(){
      super();
    }
    //para retornar algo do singleton criarei um metodo publico
    public static SingletonLazy getInstancia(){
      if(instancia == null) // se a instancia não foi instaciada então ela deve ser instanciada
        instancia = new SingletonLazy();
      return instancia;
    }
}