package connective.binary;

import connective.Connective;
import equation.Parameter;

public abstract class BinaryConnective extends Connective{
        public abstract Parameter value(Parameter p, Parameter q);
        public abstract boolean evaluate(boolean p, boolean q);
}
