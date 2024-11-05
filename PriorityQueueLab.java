// import statements
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class PriorityQueueLab {
    public static void main(String[] args){
        PriorityQueue<Integer> prioq = new PriorityQueue<>();
        try{
            File file = new File("RandIntegers.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                prioq.add(Integer.parseInt(scan.nextLine()));
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }

        int size = prioq.size();
        for(int i = 0; i<size; i++){
            System.out.println(prioq.remove());
        }
    }
}