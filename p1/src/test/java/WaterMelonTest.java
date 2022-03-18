import org.junit.Test;

import static org.junit.Assert.*;

public class WaterMelonTest{

    @Test
    public void divide() {
        int[] tests = {-2, 0, 1,2, 100,200 };
        boolean x=true;
        for (int i =0 ; i<6 ;i++){
            WaterMelon d = new WaterMelon ();
            if(d.divide(tests[i]) == true && (tests[i] <0 || tests[i] >100 )){
                x=false;
                break;
            }
        }
        assertTrue(x);
    }
}
