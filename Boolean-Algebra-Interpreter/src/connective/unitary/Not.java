package connective.unitary;

import equation.Parameter;

public class Not extends UnitaryConnective{

        @Override
        public Parameter value(Parameter p) {
                Parameter not = new Parameter();
                not.setFalseness(p.getTruth());
                not.setTruth(p.getFalseness());
                return not;
        }

}
