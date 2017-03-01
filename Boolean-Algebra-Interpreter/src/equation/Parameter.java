package equation;

public class Parameter {
        private boolean truth;
        private boolean falseness;

        public Parameter() {
                truth = true;
                falseness = false;
        }

        /**
         * @return the truth
         */
        public boolean getTruth() {
                return truth;
        }

        /**
         * @param truth the truth to set
         */
        public void setTruth(boolean truth) {
                this.truth = truth;
        }

        /**
         * @return the falseness
         */
        public boolean getFalseness() {
                return falseness;
        }

        /**
         * @param falseness the falseness to set
         */
        public void setFalseness(boolean falseness) {
                this.falseness = falseness;
        }
        
        

}
