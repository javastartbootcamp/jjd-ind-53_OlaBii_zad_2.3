package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Sex on the beach";
        drink1.price = 23.5;
        drink1.withAlcohol = true;
        drink1.ingridient1 = new Ingridient();
        drink1.ingridient1.name = "Tequila";
        drink1.ingridient1.quantity = 250.0;
        drink1.ingridient2 = new Ingridient();
        drink1.ingridient2.name = "woda gazowana";
        drink1.ingridient2.quantity = 250.0;
        drink1.ingridient3 = new Ingridient();
        drink1.ingridient3.name = "syrop malinowy";
        drink1.ingridient3.quantity = 0.50;
        double capacity = drink1.ingridient1.quantity + drink1.ingridient2.quantity + drink1.ingridient3.quantity;

        System.out.printf("Drink: %s%n" +
                        "Cena: %.1fzł%n" +
                        "Czy zawiera alkohol: %b%n" +
                        "Składaniki: " +
                        "%n%s%n" +
                        "%s%n" +
                        "%s%n" +
                        "Pojemność: %.1fml",
                drink1.name, drink1.price, drink1.withAlcohol, drink1.ingridient1.name, drink1.ingridient2.name,
                drink1.ingridient3.name, capacity);
    }
}
//
//Przykładowy wydruk po uruchomieniu programu:
//
//Drink: Mojito
//Cena: 13.0zł
//Czy zawiera alkohol? true
//Składniki:
//woda
//sok cytrynowy
//wódka
//Pojemność: 210ml