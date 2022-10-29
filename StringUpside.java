import java.util.Scanner;
class StringUpside {
    private static void Upside(String st){
        char[] ch = new char[st.length()];
        for(int i = 0; i < st.length(); ++i){
            ch[i] = st.charAt(st.length() - i - 1);
        }
        System.out.println(String.valueOf(ch));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        Upside(st);
    }
}
