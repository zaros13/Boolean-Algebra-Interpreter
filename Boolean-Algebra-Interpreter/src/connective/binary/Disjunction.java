package connective.binary;

import equation.Parameter;

public class Disjunction extends BinaryConnective{

        @Override
        public Parameter value(Parameter p, Parameter q) {
                Parameter or = new Parameter();
                
                return or;
        }

        @Override
        public boolean evaluate(boolean p, boolean q) {
                // TODO Auto-generated method stub
                return false;
        }

}
