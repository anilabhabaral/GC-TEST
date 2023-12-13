import java.util.*;

class GcTest {
    public static void main(String[] args) {

            List<byte[]> list = new LinkedList<>();
            int index = 1;
        
            while (true) {
                byte[] b = new byte[10 * 100 * 100]; 
                list.add( b );
                Runtime rt = Runtime.getRuntime();
                System.out.printf( "[%3s] Available heap memory: %s%n", index++, rt.freeMemory() );
            }
    }
}
