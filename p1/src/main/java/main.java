import java.util.*;
public class main {
    public static void main(String[] args) {
        int a;
        Scanner S=new Scanner(System.in);
        a=S.nextInt();

        WaterMelon d = new WaterMelon ();
        boolean x = d.divide(a);
        if(x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
