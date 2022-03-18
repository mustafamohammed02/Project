import org.junit.Test;
import static org.junit.Assert.*;

public class bodyTest {

    @Test
    public void boundaries() {
        int[] sizetests = {0, 5, 7, 100, 200};
        int[] rejectedforcetests = {-200, -100, 0, 100, 200};

        boolean x = true;
        body b = new body();
        int total;

        for (int i = 0; i < sizetests.length; i++) {

            // check if arrays can be created
            if (sizetests[i] > 0) {

                int[] rejectedF = new int[sizetests[i]]; //rejected magnitudes

                // if there are a lot of forces more than test cases put the rest = 0
                if (sizetests[i] < rejectedforcetests.length) {
                    for (int j = 0; j < rejectedF.length; j++) {
                        rejectedF[j] = rejectedforcetests[j];
                    }

                } else {
                    for (int j = 0; j < rejectedforcetests.length; j++) {
                        rejectedF[j] = rejectedforcetests[j];
                    }

                    //put other element = 0
                    for (int k = sizetests[i]; k < rejectedF.length; k++)
                        rejectedF[k] = 0;
                }

                //check if magnitude of forces out of boundaries
                if (b.idle(rejectedF, sizetests[i]) == true) {
                    x = false;
                    break;
                }
            } else {

                int[] emptyArr = new int[10];

                //check if number of forces out of boundaries
                if ((sizetests[i] < 0 || sizetests[i] > 100) && (b.idle(emptyArr, sizetests[i]) == true)) {
                    x = false;
                    break;
                }
            }
        }
        assertTrue(x);
    }
}
