package connective.unitary;

import connective.Connective;
import equation.Parameter;

public abstract class UnitaryConnective extends Connective{
        public abstract Parameter value(Parameter p);
        public abstract boolean evaluate(boolean p);
}
