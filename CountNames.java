import java.util.*;

public class CountNames{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<String, Integer> CountNamesMap = new LinkedHashMap<>();
        String nama = "";
        while(true){
            System.out.print("Enter name: ");
            nama = input.nextLine();
            if(nama.isEmpty()){
                break;
            }

            if(CountNamesMap.containsKey(nama)){
                int hitung = CountNamesMap.get(nama);
                CountNamesMap.put(nama, hitung + 1);
            }else{
                CountNamesMap.put(nama, 1);
            }
        }

        for(String name : CountNamesMap.keySet()){
            int jumlah = CountNamesMap.get(name);
            System.out.println("Entry [" + name + "] has count " + jumlah);
        }
    }
}
