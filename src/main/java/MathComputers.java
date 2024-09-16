interface Computation {
    int compute(int number1, int number2);
}
class MultiplyComputer implements Computation {
    public int compute(int number1, int number2){
        return number1 * number2;
    }
}
class PlusComputation implements Computation {
    public int compute(int number1, int number2) {
        return number1 + number2;
    }
}

class DivideComputer implements Computation {
    public int compute(int number1, int number2){
        return number1 / number2;
    }
}
class ComputeSubtract implements Computation {
    public int compute(int number1, int number2){
        return number1 - number2;
    }
}