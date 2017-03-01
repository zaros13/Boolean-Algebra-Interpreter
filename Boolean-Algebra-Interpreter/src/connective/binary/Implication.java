package connective.binary;

import equation.Parameter;

public class Implication extends BinaryConnective{

        @Override
        public Parameter value(Parameter p, Parameter q) {
                Parameter imply = new Parameter();
                return imply;
        }

}
