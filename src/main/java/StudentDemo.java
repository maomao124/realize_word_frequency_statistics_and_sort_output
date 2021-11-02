import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Project name(项目名称)：实现词频统计和排序输出
 * Package(包名): PACKAGE_NAME
 * Class(类名): StudentDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/2
 * Time(创建时间)： 22:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class StudentDemo
{
    //获取单词的数量
    public Map<String, Integer> getWordCount(String str)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();

//请在此添加实现代码
/********** Begin **********/
        StringTokenizer strToken = new StringTokenizer(str);
        int count = 0;
        while (strToken.hasMoreTokens())
        {
            String word = strToken.nextToken(" ,;.!?‘’");
            if (map.containsKey(word))
            {
                count = map.get(word);
                map.put(word, count + 1);
            }
            else
            {
                map.put(word, 1);
            }
        }

/********** End **********/


        return map;
    }
}
