import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPalindrome(int x) {
        int i = 0;
        int cur ;
        int size;
        Map<Integer, Integer> rMap = new HashMap<>();
        if(x < 0 ){
            return false;
        }
        while((cur = x % 10) != 0 || x / 10 != 0){
            rMap.put(i , cur);
            x = x / 10;
            i++;
        }
        size = rMap.size();
        for(int n = 0; n < size;n++) {
            while (rMap.get(n) != rMap.get(size - n - 1)) {
                return false;
            }
            ;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;

        System.out.println(solution.isPalindrome(n));
    }
}