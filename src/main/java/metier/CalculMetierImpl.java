package metier;

public class CalculMetierImpl implements CalculMetier {
    @Override
    public double calculer(double op1, double op2, String operation) {
         double Result  =  0;
          if( operation.equals("Addition")){
              Result = op1 + op2;
          }
        if( operation.equals("Subtraction")){
            Result = op1 - op2;
        }
        if( operation.equals("Multiplication")){
            Result = op1 * op2;
        }
        if( operation.equals("Division")){
            Result = op1 + op2;
        }



        return Result;
    }

}
