package org.example.ad1;
public class Pizza {
    private String additives;
    private String cake;
    private String tomatoSauce;

    Pizza(PizzaBuilder builder) {
        this.additives = builder.additives;
        this.cake = builder.cake;
        this.tomatoSauce = builder.tomatoSauce;
    }

    public String getAdditives() {
        return additives;
    }

    public String getCake() {
        return cake;
    }

    public String getTomatoSauce() {
        return tomatoSauce;
    }

    public class PizzaBuilder {
        String additives;
        String cake;
        String tomatoSauce;


        public PizzaBuilder setAdditives(String additives) {
            this.additives = additives;
            return this;
        }

        public PizzaBuilder setCake(String cake) {
            this.cake = cake;
            return this;
        }

        public PizzaBuilder setTomatoSauce(String tomatoSauce) {
            this.tomatoSauce = tomatoSauce;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

    //tutaj jest błąd
    public class Main {
        public static void main(String[] args) {
            Pizza pizza = new Pizza.PizzaBuilder()
                    .setAdditives("salami");
                .setCake("fat");
                .setTomatoSauce("hot");
                .build();
        }

    }
}
