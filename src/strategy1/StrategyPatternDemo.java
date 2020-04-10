package strategy1;

import java.util.Scanner;

interface Strategy {

    public String doOperation();
}

class Sad implements Strategy {

    @Override
    public String doOperation() {
        return "Playing The eye of the tiger ";
    }
}

class Happy implements Strategy {

    @Override
    public String doOperation() {
        return "Playing Caste of Glass";
    }
}

class Romantic implements Strategy {

    @Override
    public String doOperation() {
        return "Playing shape of you";
    }
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy() {
        return strategy.doOperation();
    }
}

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context;
        Scanner s = new Scanner(System.in);
        boolean a = true;
        while (a == true){
        System.out.println("How is the mood\n1.Sad\n2.Happy\n3.Romantic\n");
            switch (s.nextInt()) {
                case 1:
                    context = new Context(new Sad());
                    System.out.println("My teacher scolded me\n" + context.executeStrategy() + "\n");
                    break;
                case 2:
                    context = new Context(new Happy());
                    System.out.println("I got full marks in ut\n" + context.executeStrategy() + "\n");
                    break;
                case 3:
                    context = new Context(new Romantic());
                    System.out.println("Im with someone\n" + context.executeStrategy() + "\n");
                    break;
                case 4:
                    a = false;
                default:
                    System.out.println("Plaese choose a mood");
            }
        }
    }
}
