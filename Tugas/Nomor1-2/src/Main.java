// Rizqi Zamzami Jamil 20 2141762089
public class Main {
    public static void main(String[] args) {
        sewaGame sg = new sewaGame();

        sg.id = 214;
        sg.game = "PES 2022";
        sg.member = "Rizqi Zamzami";
        sg.hargaSewa = 5000;
        sg.tampilData();
        System.out.println("Total bayar : Rp. "+sg.bayar(10));
    }
}
