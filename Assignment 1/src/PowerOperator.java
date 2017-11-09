import java.lang.*;
import java.util.*;

/**
 *
 * @author tmytrn
 */
public class PowerOperator extends Operator{

    @Override
    public int priority() {
        return 4; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        Operand ans = new Operand(power(op1.getValue(),op2.getValue() ));
        return ans;
                //To change body of generated methods, choose Tools | Templates.
    }
    public int power(int i, int j){
        int ans = i;
        for(int count = 2; count <= j; count++){
             ans = ans * i;
        }
        return ans;
        
    }
    
}
