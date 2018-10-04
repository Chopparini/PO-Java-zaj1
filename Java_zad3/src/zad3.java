public class zad3 {

    public static void main(String[] args) {

        int[] array = {100, 1, 2, 300,
                400, 500, 600,
                700, 800, 900, 1000,
                1, 2, 39};
        int n=array.length-2;

        for (int i=-0; i<=n; i++) {
            int j=i+1;
            int k = j+1;

            if (array[i]==1) {
                if (array[j]==2) {
                    if (array[k]==3){
                        System.out.print("True");
                    }
                }
            }
        }
        }
    }
