/**
  "Italo"
  @author italo
*/

class Main {
  public static void main(String[] args) {

    System.out.println("\nSingleton\n");
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    
    SingletonApressado Apressado = SingletonApressado.getInstancia();
    System.out.println(Apressado);
    Apressado = SingletonApressado.getInstancia();
    System.out.println(Apressado);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    System.out.println("\nStrategy\n");

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();

    robo.setStrategy(normal);
    robo.mover();
    robo.setStrategy(agressivo);
    robo.mover();
    robo.setStrategy(defensivo);
    robo.mover();

    System.out.println("\nFacade\n");

    Facade facade = new Facade();
    facade.migrarCliente("Italo", "52211415");
  }
}