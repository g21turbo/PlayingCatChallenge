public class Main {
    public static void main(String[] args) {

        System.out.println("The cat is playing: " + isCatPlaying(true, 55));
        System.out.println("The cat is playing: " + isCatPlaying(false, 55));
        System.out.println("The cat is playing: " + isCatPlaying(true, 25));


    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(!summer  && (temperature >= 25 && temperature <= 35)){
            return true;
        }
        else if(summer && (temperature>= 25 && temperature <= 45)){
            return true;
        }
        else{
            return false;
        }
    }
}