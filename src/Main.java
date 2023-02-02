public class Main {
    public static void main(String[] args){
        VigenereCipher vc = new VigenereCipher("LEMON");
        String encodedMessage = vc.encode("ATTACKATDAWN");
        System.out.println(encodedMessage);
        String decodedMessage = vc.decode("lxfopvefrnhr");
        System.out.println(decodedMessage);
    }
}
