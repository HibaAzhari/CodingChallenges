public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        List<Integer> nodes = new ArrayList<Integer>();
        checkLevels(root, 0, ans, nodes);
        for(int i = 0; i < nodes.size(); i++){
            ans.set(i, ans.get(i)/nodes.get(i));
        }
        return ans;
    }
    public void checkLevels(TreeNode root, int i, List<Double> sums, List<Integer> nodes){
        if(root == null) return;
        if(i >= sums.size()){
            sums.add(Double.valueOf(root.val));
            nodes.add(1);
        } else{
            sums.set(i, sums.get(i) + Double.valueOf(root.val));
            nodes.set(i, nodes.get(i) + 1);
        }
        checkLevels(root.left, i + 1, sums, nodes);
        checkLevels(root.right, i + 1, sums, nodes);
    }
}
