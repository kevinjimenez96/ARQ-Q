package Computer.CPU;

import Computer.Utils.BitSet;

public class JumpInstruction extends Instruction{

    private BitSet secondOperand;
    private BitSet offset;

    public BitSet getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BitSet secondOperand) {
        this.secondOperand = secondOperand;
    }

    public BitSet getOffset() {
        return offset;
    }

    public void setOffset(BitSet offset) {
        this.offset = offset;
    }
}