package day07.day09;

public class LargestString {
    public static void main(String[] args) {
        String[] names={"ronaldo","messi","neymar","mbappe"};
        String largest=names[0];
        for (int i=1;i<names.length;i++){
            if(names[i].length()>largest.length()){
            largest=names[i];
            }
        }
        System.out.println("String with maximum letters:"+largest);
        System.out.println("letter count:" + largest.length());
    }
}
                
