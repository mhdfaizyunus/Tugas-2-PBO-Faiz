public class Driver {
    public static void main(String[] args) {
        Asdos fairuzi = new Asdos("fairuzikun", 23, 4);
        Dosen rajadamanik = new Dosen("Raja OP Damanik", 5);
        Asdos angelkun = new Asdos("Angel-chan", 19, 7);
        Mahasiswa firmanutina = new Mahasiswa("Firman", 20);
        Mahasiswa nid = new Mahasiswa("Nid to pass this sem", 23);
        Dosen nivochan = new Dosen("Nivotko", 3);

        fairuzi.show();
        rajadamanik.show();
        angelkun.show();
        firmanutina.show();
        nid.show();
        nivochan.show();

        int totalJamNyibukanDiri = fairuzi.jamSibuk + rajadamanik.jamSibuk +
                angelkun.jamSibuk + firmanutina.jamSibuk + nid.jamSibuk + nivochan.jamSibuk;

        System.out.println("Total jam sibuk elemen fasilkom adalah " + totalJamNyibukanDiri);
    }
}
