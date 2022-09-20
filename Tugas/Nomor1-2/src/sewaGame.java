// Rizqi Zamzami Jamil 20 2141762089
public class sewaGame {
    public int id;
    public String member;
    public String game;
    public int hargaSewa;

    public void tampilData(){
        System.out.println("=-= DRAGONS GAME =-=");
        System.out.println("Id    : "+id);
        System.out.println("Nama  : "+member);
        System.out.println("Game  : "+game);
        System.out.println("Sewa  : "+hargaSewa);
        System.out.println("=-=-=-=-=-==-=-=-=-=");
    }

    public int bayar(int lama) {
        int bayar = lama * hargaSewa;
        return bayar;
    }
}
