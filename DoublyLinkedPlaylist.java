public class DoublyLinkedPlaylist {
    Song head;
    Song tail;
    Song current;

    public void addSong(String title){
        Song newSong = new Song(title);
        if (head == null){
            head = tail = current = newSong;
            return;
        }else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
        System.out.println("Added: " + title);
    }

    public void nextSong(){
        if (current != null && current.next != null){
            current = current.next;
            System.out.println("NS: Now Playing: " + current.title);
        }else {
            System.out.println("End of playlist.");
        }
    }

    public void previousSong(){
        if (current != null && current.prev != null){
            current = current.prev;
            System.out.println("PS: Now Playing: " + current.title);
        }else {
            System.out.println("Start of playlist.");
        }
    }
    public void printPlaylist(){
        Song temp = head;
        System.out.println("Playlist:");
        while (temp != null){
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("End.");
    }
    public void removeCurrent() {
        if (current == null) return;

        System.out.println("Removing: " + current.title);

        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;
        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev;

        current = current.next != null ? current.next : head;
    }
}
