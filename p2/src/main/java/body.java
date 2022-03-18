public class body {
    public boolean idle(int [] f, int n){
        if(n<1 || n>100)
            return false;
        for (int i = 0 ; i < f.length ; i++){
            if (f[i]<-100 || f[i]>100)
                return false;
        }
        int total = 0;
        for (int j = 0 ; j < 3 ; j++){
            total = 0;

            for(int k = j;k<f.length;k+=3)
                total += f[k];

            if (total != 0)
                return false;
        }
        return true;
    }}

