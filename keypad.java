public class keypad {
    // str = 23  
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcombi(String str , int idx ,String combi){
        if(idx==str.length()){
            System.out.println(combi);
            return;
        }
        char curr =str.charAt(idx);
        String index=keypad[curr-'0'];
         
        for(int i=0;i<index.length();i++){
            printcombi(str, idx+1, combi+index.charAt(i));
        }

    }
    public static void main(String[] args) {
        String x = "12";
        printcombi(x, 0, "");
    }
}
