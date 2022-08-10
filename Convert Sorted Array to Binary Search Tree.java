class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
    
    TreeNode create(int nums[],int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid = s + (e-s)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = create(nums,s,mid-1);
        root.right = create(nums,mid+1,e);
        return root;
    }
}
