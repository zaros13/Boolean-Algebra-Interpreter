package connective.binary;

import equation.Parameter;

public class Conjunction extends BinaryConnective{

        @Override
        public Parameter value(Parameter p, Parameter q) {
                Parameter and = new Parameter();
                return and;
        }

        @Override
        public boolean evaluate(boolean p, boolean q) {
                // TODO Auto-generated method stub
                return false;
        }

}
