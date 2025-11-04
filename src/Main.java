public class Main {
    public static void main(String[] args){
        API api = new API();
        System.out.println(api.fetchArtisti());
        System.out.println(api.fetchArtista(1));
    }
}
