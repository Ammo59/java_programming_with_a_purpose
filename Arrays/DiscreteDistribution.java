public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        int[] CumSum = new int[args.length]; CumSum[0] = 0;
        
    for (int ii = 1; ii < args.length;  ii++) {
            a[ii - 1] = args[ii];
            CumSum[ii] = a[ii - 1] + CumSum[ii - 1];
        }
      

    for (int jj = 0; jj < m;  jj++) {
       int r = (int) (Math.random() * (CumSum[ii]));
    for (int i = 0; i < args.length;  i ++) {     
       		if ((r >= CumSum[i]) && (r < CumSum[i + 1])); {
              System.out.print(i + 1 + " ");
          }
     }
}
