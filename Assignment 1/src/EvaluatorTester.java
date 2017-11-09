public class EvaluatorTester {
  public static void main(String[] args) {
Evaluator evaluator = new Evaluator();
    String[] test = {
        "(6 * 3 + 8 + 3)", //
        "5 - 3 - 8", //
        "5 + 5 * 10 / 10",
        "2^5",
        "4^2",
        "4 + (1 + 2)",
        "(1 + 3) + 4",
        "(5+2)+(4*9)*(2*2)^2",
        "(((1+2)+ 3)+4)"
//
            
    };
    for ( String arg : test ) {
      System.out.format( "%s = %d\n", arg, evaluator.eval( arg ) );

    }
  }
}
