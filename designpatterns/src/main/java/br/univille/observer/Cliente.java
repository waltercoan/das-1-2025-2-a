package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();

        var zezinho = new ConcreteSubscriber();
        var huguinho = new ConcreteSubscriber();
        var tia = new ConcreteSubscriber();

        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(huguinho);
        grupoFamilia.subscribe(tia);

        grupoFamilia.setMainState("BOM DIAAA ❤️❤️❤️");
        grupoFamilia.notifySubscribers();
        
    }
}
