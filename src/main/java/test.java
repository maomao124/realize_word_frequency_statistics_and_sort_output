import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Project name(项目名称)：实现词频统计和排序输出
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/2
 * Time(创建时间)： 22:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args) throws IOException
    {
        StudentDemo demo = new StudentDemo();
        BufferedReader buffer = new BufferedReader(new FileReader("readme.txt"));
        String str = "", s = "";
        while ((str = buffer.readLine()) != null)
        {
            s += str;
        }
        Map<String, Integer> wordCount = demo.getWordCount(s);
        List<Map.Entry<String, Integer>> sortWordCount = sortWordCount(wordCount);
        for (Map.Entry<String, Integer> entry : sortWordCount)
        {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    //对单词出现的次数进行排序
    public static List<Map.Entry<String, Integer>> sortWordCount(Map<String, Integer> map)
    {
        List<Map.Entry<String, Integer>> infos = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(infos, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue() - o1.getValue());
            }
        });
        return infos;
    }
}
