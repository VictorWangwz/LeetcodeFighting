package vopreparation0530;

public class MovingAverage {

    /** Initialize your data structure here. */
    public MovingAverage(int size) {

    }

    public double next(int val) {
        return 1;
    }

    public static void main(String[] args) {
        int size  = 3;
        MovingAverage obj = new MovingAverage(size);
        double param_1 = obj.next(1);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
//MovingAverage m = new MovingAverage(3);
//m.next(1) = 1
//        m.next(10) = (1 + 10) / 2
//        m.next(3) = (1 + 10 + 3) / 3
//        m.next(5) = (10 + 3 + 5) / 3
