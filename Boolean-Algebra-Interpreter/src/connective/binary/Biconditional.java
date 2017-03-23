package connective.binary;

import equation.Parameter;

public class Biconditional extends BinaryConnective{

        @Override
        public Parameter value(Parameter p, Parameter q) {
                Parameter equivalent = new Parameter();
                return equivalent;
        }

        @Override
        public boolean evaluate(boolean p, boolean q) {
                // TODO Auto-generated method stub
                return false;
        }

}
