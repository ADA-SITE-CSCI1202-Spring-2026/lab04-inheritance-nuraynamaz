public class MathDemo {
    private  int a;
    private  int b;
    public static int min(int a,int b){
        if (a > b)
            return b;
        return a;
    }

    public static int max(int a, int b){
        if (a > b)
            return a;
        return b;
    }

    public static int sum(int[] args){
        int sum = 0;
        for (int i : args){
            sum += i;
        }
        return sum;

    }
}
