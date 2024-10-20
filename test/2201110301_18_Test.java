
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

        /*本次测试采用的是等价类划分原则
        输入数组长度：
        1.有效等价类：大于0的整数。
        2.无效等价类：0或负数。
        数组元素：
        1.有效等价类：包含正整数、负整数、零的数组。
        2.无效等价类：空数组（虽然根据题意这种情况不会发生，因为输入是一个整数数组，但考虑完整性）。
        边界值：
        1.数组长度为1时。
        2.数组中包含1和-1时。
        3.数组中包含大数（如Integer.MAX_VALUE）和小数（如1）。*/

class SolutionTest {
    private static Solution cal = new Solution();
    //普通数组
    //输入: nums = [1,2,3,4]
    //输出: [24,12,8,6]
    @Test
    public void test1(){
    assertArrayEquals(new int[]{24,12,8,6},cal.productExceptSelf(new int[]{1,2,3,4}));
    }
    //包含0以及1和-1的数组
    //输入: nums = [-1,1,0,-3,3]
    //输出: [0,0,9,0,0]
    @Test
    public void test2(){
        assertArrayEquals(new int[]{0,0,9,0,0},cal.productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
    //边界值：数组长度为1
    //输入：nums =[5]
    //输出：[1]
    @Test
    public void test3(){
        assertArrayEquals(new int[]{1}, cal.productExceptSelf(new int[]{5}));
    }
    //大数和小数混合
    //输入：nums =[1,Integer.MAX_VALUE,2,3]
    //输出：[Integer.MAX_VALUE * 6, 6, Integer.MAX_VALUE * 3, Integer.MAX_VALUE * 2]
    @Test
    public void test4(){
        assertArrayEquals(new int[]{Integer.MAX_VALUE * 6, 6, Integer.MAX_VALUE * 3, Integer.MAX_VALUE * 2}, cal.productExceptSelf(new int[]{1,Integer.MAX_VALUE,2,3}));
    }


}