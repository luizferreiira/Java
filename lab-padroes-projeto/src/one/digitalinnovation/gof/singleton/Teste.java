package one.digitalinnovation.gof.singleton;

public class Teste {
    public static void main(String[] args) {

        //Testes Relacionados ao Design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



    }
}
