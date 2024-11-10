import java.util.ArrayList;
import java.util.List;
import solution.Solution;
import org.junit.Test;
import org.springframework.util. CollectionUtils;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
 //dev


 //main
//采用等价类划分原则，将测试集分为三类：
//第一类为输入字符串长度不足或等于10的情况，预计返回的结果为空；
//第二类为输入字符串长度大于10且其中有出现不止一次的长度为10的子字符串的情况，预计返回结果不为空；
//第三类为输入字符串长度大于10且其中没有出现不止一次的长度为10的子字符串的情况，预计返回结果为空。
public class L2022212037_18_Test {

    //测试当输入字符串长度不足或等于10时，返回的结果是否为空
    //第一次测试用例为长度刚好为10的字符串"AAAAAAAAAA"
    //第二次测试用例为长度小于10的字符串"AACCCTTTG"
    //分别输出两次测试返回是否为空的判别结果，为空则输出true，反之输出false
    @Test
    public void test1(){
        List<String> result_A=Solution.findRepeatedDnaSequences("AAAACCCGTTTAAAACCCGTTT");
        List<String> result_A2=Solution.findRepeatedDnaSequences("AAAACCCGTTTAAAACCCGTTT");
        boolean result_a=CollectionUtils.isEmpty(result_A);
        boolean result_a2=CollectionUtils.isEmpty(result_A2);
        assertFalse(result_a);
        assertFalse(result_a2);
    }

    //测试当输入字符串长度大于10且其中有出现不止一次的长度为10的子字符串时，返回的结果是否正确
    //测试用例为"AAAACCCGTTTAAAACCCGTTT"
    //预计输出结果为["AAAACCCGTT","AAACCCGTTT"]
    //若返回结果符合预期则输出true，反之则false
    @Test
    public void test2(){
        List<String> result_B=Solution.findRepeatedDnaSequences("AAAACCCGTTTAAAACCCGTTT");
        List<String> test_B=new ArrayList<>();
        test_B.add("AACCCG");
        test_B.add("AAACCCTT");
        boolean result_b=test_B.equals(result_B);
        assertFalse(result_b);
        //System.out.println(result_B);
    }

    //测试当输入字符串长度大于10且其中没有出现不止一次的长度为10的子字符串时，返回的结果是否为空
    //测试用例为"AAAAAAAAACGTTTTTTT"
    //返回结果为空则输出true,反之则false
    @Test
    public void test3(){
        List<String> result_C=Solution.findRepeatedDnaSequences("AAAACCCGTTTAAAACCCGTTT");
        boolean result_c=CollectionUtils.isEmpty(result_C);
        assertFalse(result_c);
    }
}
