import java.nio.charset.StandardCharsets;
public class Test{
    public static void main(String[] args){
        String name = "java bytes";
        byte[] nameAsByte = name.getBytes();
        System.out.println("values stored in Byte [] is : ");
        for(byte i : nameAsByte){
            System.out.println(i);
        }
        System.out.println("Coverted value from byte [] to String : ");
        System.out.println(new String(nameAsByte,StandardCharsets.UTF_8));
    }
}