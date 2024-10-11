package lab2_2022211952.lab2_2022211952;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;  
import java.util.List;

import org.junit.Test;

import lab2_2022211952.lab2_2022211952.Solution; 
public class L2022211952_11_Test {
 
  

    private List<List<Integer>> threeSum(int[] nums) {  
        Solution solution = new Solution();  
        return solution.threeSum(nums);  
    }  
  
    // 测试用例设计的总体原则：  
    // - 使用等价类划分原则，确保测试有效和无效的输入。  
    // - 使用边界值分析，确保测试边界情况。  
  
    // 测试目的：验证在包含正确结果的情况下，方法能够返回正确的三元组  
    @Test  
    public void testValidInputWithResults() {  
        int[] nums = {-1, 0, 1, 2, -1, -4};  
        List<List<Integer>> expected = Arrays.asList(  
            Arrays.asList(-1, -1, 2),  
            Arrays.asList(-1, 0, 1)  
        );  
        List<List<Integer>> actual = threeSum(nums);  
        assertEquals(expected, actual);  
    }  
  
    // 测试目的：验证在没有三元组满足条件的情况下，方法返回空列表  
    @Test  
    public void testValidInputNoResults() {  
        int[] nums = {0, 1, 1};  
        List<List<Integer>> expected = Arrays.asList();  
        List<List<Integer>> actual = threeSum(nums);  
        assertEquals(expected, actual);  
    }  
  //测试目的：验证唯一可能的三元组和为0
    @Test  
    public void onlyOneValidInputWithResults() {  
        int[] nums = {0, -1, 1};  
        List<List<Integer>> expected = Arrays.asList(
        		 Arrays.asList(-1, 0, 1)
        		 );  
        List<List<Integer>> actual = threeSum(nums);  
        assertEquals(expected, actual);  
    }  
    // 测试目的：验证在数组包含重复元素且存在多个三元组的情况下，方法能够返回所有不重复的三元组  
    @Test  
    public void testValidInputWithDuplicates() {  
        int[] nums = {0, 0, 0, 0, 0};  
        List<List<Integer>> expected = Arrays.asList(  
            Arrays.asList(0, 0, 0)  
        );  
        List<List<Integer>> actual = threeSum(nums);  
        assertEquals(expected, actual);  
    }  
  
    // 测试目的：验证在数组为空的情况下，方法能够正确处理并返回空列表  
    @Test  
    public void testEmptyInput() {  
        int[] nums = {};  
        List<List<Integer>> expected = Arrays.asList();  
        List<List<Integer>> actual = threeSum(nums);  
        assertEquals(expected, actual);  
    }  
  
    // 测试目的：验证在数组只包含一个元素的情况下，方法能够正确处理并返回空列表  
    @Test  
    public void testSingleElementInput() {  
        int[] nums = {0};  
        List<List<Integer>> expected = Arrays.asList();  
        List<List<Integer>> actual = threeSum(nums);  
        assertEquals(expected, actual);  
    }  
  
    // 测试目的：验证在数组只包含两个元素的情况下，方法能够正确处理并返回空列表  
    @Test  
    public void testTwoElementsInput() {  
        int[] nums = {0, 1};  
        List<List<Integer>> expected = Arrays.asList();  
        List<List<Integer>> actual = threeSum(nums);  
        assertEquals(expected, actual);  
    }  
  
}