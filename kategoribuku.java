import java.util.Scanner;

public class kategoribuku {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Input Judul Buku");
String judulBuku = input.nextLine();

System.out.println("Input Nama Pengarang");
String pengarang = input.nextLine();

System.out.println("Input Nama Penerbit");
String penerbit = input.nextLine();

System.out.println("Input Tahun Terbit");
int tahunTerbit = input.nextInt();

// Variable untuk kategori buku
String kategoriBuku = "";

if (tahunTerbit < 2010) {
kategoriBuku = "Buku Lama";
}
else if (judulBuku.contains("Teknik")) {
kategoriBuku = "Buku Teknik";
}
else if (judulBuku.contains("Manajemen")) {
kategoriBuku = "Buku Manajemen";
}
else if (judulBuku.contains("Fiksi")) {
kategoriBuku = "Buku Fiksi";
}
else {
kategoriBuku = "Buku Lainnya";
}

System.out.println("Judul buku: " + judulBuku);
System.out.println("Nama pengarang: " + pengarang);
System.out.println("Nama penerbit: " + penerbit);
System.out.println("Tahun terbit: " + tahunTerbit);
System.out.println("Kategori buku: " + kategoriBuku);
}
}