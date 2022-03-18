public class WaterMelon {
    public boolean divide (int x){
        if (x>100 || x<0)
            return false;
        for (int i = x-1; i>((x/2) -1) ; i--){
            if(((x-i)%2 ==0) && (i%2==0))
                return true;
        }
        return false;
    }

}
