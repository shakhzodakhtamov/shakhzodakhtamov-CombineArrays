
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int al=arr1.length;
        int bl=arr2.length;
        int cl=al+bl;
        int[] newarr= new int[cl];
        for(int i =0; arr1.length>i;i++){
            newarr[i]=arr1[i];
        }
        for(int i =0; arr2.length>i;i++){
            newarr[arr1.length+i]=arr2[i];
        }

        return newarr;
    }
}
