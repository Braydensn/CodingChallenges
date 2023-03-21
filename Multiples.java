public class Multiples{
    public int[] findMultiples(int base, int length){
        int[] mults = new int[length];
        for(int i = 1; i <= length; i++){
            mults[i-1] = base * i;
        }

        return mults;
    }
}