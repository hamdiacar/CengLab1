public class Main {
    public static void main(String[] args){
        DoublyLinkedPlaylist myPlaylist = new DoublyLinkedPlaylist();

        myPlaylist.addSong("Hande Yener -- Sopa");
        myPlaylist.addSong("Demet Akalın -- Nazar");
        myPlaylist.addSong("Serdar Ortaç -- Poşet");
        myPlaylist.addSong("Mustafa Sandal -- Aya Benzer");

        myPlaylist.printPlaylist();
        myPlaylist.nextSong();
        myPlaylist.nextSong();
        myPlaylist.previousSong();
        myPlaylist.previousSong();
        myPlaylist.removeCurrent();

    }
}