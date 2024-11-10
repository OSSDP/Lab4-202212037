package hit.debug;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSolutioned {

    @Test
    void testProductExceptSelf() {
        Solution solution = new Solution();

        // 示例 1
        int[] nums1 = {1, 2, 3, 4};
        int[] expected1 = {24, 12, 8, 6};
        assertArrayEquals(expected1, solution.productExceptSelf(nums1));

        // 示例 2
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] expected2 = {0, 0, 9, 0, 0};
        assertArrayEquals(expected2, solution.productExceptSelf(nums2));

        // 测试边界情况：只有一个元素
        int[] nums3 = {5};
        int[] expected3 = {1}; // 只有一个元素，除自身外没有元素，返回 1
        assertArrayEquals(expected3, solution.productExceptSelf(nums3));

        // 测试边界情况：包含零
        int[] nums4 = {0, 1, 2, 3};
        int[] expected4 = {6, 0, 0, 0}; // 0 应该导致其他元素的乘积为 0
        assertArrayEquals(expected4, solution.productExceptSelf(nums4));

        // 测试多个零
        int[] nums5 = {1, 0, 0, 3};
        int[] expected5 = {0, 0, 0, 0}; // 只有一个 3 的位置会有非零乘积
        assertArrayEquals(expected5, solution.productExceptSelf(nums5));
    }
}
