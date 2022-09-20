// Rizqi Zamzami Jamil 21417162089 SIB-2E 20
public class TestMahasiswa {
    public static void main (String args[]){
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 2141762089;
        mhs2.nama = "Rizqi";
        mhs2.alamat = "Jl. Joyoutomo";
        mhs2.kelas = "2E";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 2141762143;
        mhs3.nama = "Bangkit";
        mhs3.alamat = "Jl. Piranha";
        mhs3.kelas = "2E";
        mhs3.tampilBiodata();
    }
}
