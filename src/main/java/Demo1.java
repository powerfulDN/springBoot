public class Demo1 {
    public static void main(String[] args) {
        String str = "我想把字符串输出中间带空格";
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char a:chars) {
            builder.append(a);
            builder.append(" ");
        }

        System.out.println(builder);

    }
}
