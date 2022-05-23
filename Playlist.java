import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("High enough");
        desertIslandPlaylist.add("Rock n Roll");
        desertIslandPlaylist.add("White Wine");
        desertIslandPlaylist.add("Evergreen");
        desertIslandPlaylist.add("Sound of silence");
        desertIslandPlaylist.add("Another one bites the dust");

        desertIslandPlaylist.remove("Evergreen");


        System.out.println(desertIslandPlaylist.indexOf("White Wine"));



        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

    }








}
