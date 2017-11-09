import java.util.*;

public class Evaluator {
  private Stack<Operand> operandStack;
  private Stack<Operator> operatorStack;

  private StringTokenizer tokenizer;
  private static final String DELIMITERS = "()+-*^/#! ";

  public Evaluator() {
    operandStack = new Stack<>();
    operatorStack = new Stack<>();
  }
  
  public void process(){
            while(operatorStack.peek().priority() > 1){
            Operator oldOpr = operatorStack.pop();
            Operand op2 = operandStack.pop();
            Operand op1 = operandStack.pop();
            operandStack.push( oldOpr.execute( op1, op2 ));
            }
            operatorStack.pop();
           
  }
  

  public int eval( String expression ) {
    operatorStack.push(new StartExpressionOperator());
    String token;
    this.tokenizer = new StringTokenizer( expression, DELIMITERS, true );
    
    while ( this.tokenizer.hasMoreTokens() ) {
      // filter out spaces
      if ( !( token = this.tokenizer.nextToken() ).equals( " " )) {
        // check if token is an operand
        if ( Operand.check(token)) {    
            operandStack.push( new Operand( token ));
        } else {
          if (! Operator.check( token )) {
            System.out.println( "*****invalid token******" );
            System.exit( 1 );
          }
          if(token.equals(")")){
              process();
              continue;
          }
          if(token.equals("(")){
              operatorStack.push(new OpenParOperator());
              continue;
          }
          Operator newOperator = Operator.getOperator(token);
          
          
          if(operatorStack.isEmpty()){
              operatorStack.add(newOperator);
              continue;
          }
          

          while ( operatorStack.peek().priority() >= newOperator.priority()) {
            Operator oldOpr = operatorStack.pop();
            Operand op2 = operandStack.pop();
            Operand op1 = operandStack.pop();
            operandStack.push( oldOpr.execute( op1, op2 ));
           }
          operatorStack.push(newOperator);
      }
    }
  }
          while(operatorStack.peek().priority() > 0){
              Operator Opr = operatorStack.pop();
              Operand o2 = operandStack.pop();
              Operand o1 = operandStack.pop();
              operandStack.push(Opr.execute(o1, o2));
          }
          return operandStack.pop().getValue();
}

}
