import java.util.ArrayList;

/*Given a quadratic equation in the form ax2 + bx + c. Find its roots.

Note: Return the maximum root followed by the minimum root.*/
public class QuadraticEquationRoots {

    public static void main(String[] args) {
            int a, b, c;
            a = 1;
            b = -7;
            c = 12;
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

    }

}

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<>();
        int d = b*b - 4*a*c;
        if(d < 0){
            roots.add(-1);
        }else{
            double sqrtValue = Math.sqrt(Math.abs(d));
            double root1 = Math.floor((-b+sqrtValue)/ (2*a));
            double root2 = Math.floor((-b-sqrtValue)/ (2*a));

            roots.add((int) Math.max(root1, root2));
            roots.add((int) Math.min(root1, root2));
        }

        return roots;
    }
}