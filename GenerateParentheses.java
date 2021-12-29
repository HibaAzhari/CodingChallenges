import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {
    public List<String> combinations = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        backtrack("", 0, 0, n);
        return combinations;
    }
    
    public void backtrack(String current, int open, int close, int max){
        if(current.length() == max*2){
            combinations.add(current);
            return;
        }
        
        if(open < max){
            backtrack(current + "(", open + 1, close, max);
        }
        if(close < open){
            backtrack(current + ")", open, close + 1, max);
        }
    }
}