import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minjembuku{

        public static void main(String[] args){

            int lamapinjaman,telat,denda;
            int pelajaran,novel,cerpen;

            Scanner input = new Scanner(System.in);
            System.out.println("Input Lama Peminjaman : ");
            lamapinjaman = input.nextInt();

            
            telat = lamapinjaman-10;
            System.out.println("Telat Mengembalikan : " + telat);

            if(lamapinjaman == 10){
                System.out.println("tidak ada denda");
            } else if( lamapinjaman > 10){
                pelajaran = telat * 1000;
                novel = telat * 2000;
                cerpen = telat * 1500;
                 
                System.out.println("denda buku pelajaran : Rp." + pelajaran);
                System.out.println("denda buku pelajaran : Rp." + novel);
                System.out.println("denda buku pelajaran : Rp." + cerpen);

            }


        }

}