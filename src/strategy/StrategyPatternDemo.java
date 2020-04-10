package strategy;

interface Strategy {
   public int doOperation(int dist);
}
class ExpressCar implements Strategy{
   @Override
   public int doOperation(int dist) {
      return dist*6;
   }
}
class Car implements Strategy{
   @Override
   public int doOperation(int dist) {
      return dist*4;
   }
}
class Bike implements Strategy{
   @Override
   public int doOperation(int dist) {
      return dist*2;
   }
}
class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int dist){
      return strategy.doOperation(dist);
   }
}
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new ExpressCar());		
      System.out.println("Fare for Exclusive Car is " + context.executeStrategy(10));

      context = new Context(new Car());		
      System.out.println("Fare for Simple Car is " + context.executeStrategy(10));

      context = new Context(new Bike());		
      System.out.println("Fare for bike is " + context.executeStrategy(10));
   }
}
