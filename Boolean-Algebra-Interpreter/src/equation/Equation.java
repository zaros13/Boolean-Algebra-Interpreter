package equation;
import java.util.*;

import connective.Connective;

public class Equation {
        private ArrayList<Connective> equation;
        
        public Equation(){
                equation = new ArrayList<Connective>();
        }
        
        public Equation(String equation){
                readString(equation);
        }
        
        public void readString(String equation) throws IllegalArgumentException{
                
        }
        
        public String toString(){
                return equation.toString();
        }
}
