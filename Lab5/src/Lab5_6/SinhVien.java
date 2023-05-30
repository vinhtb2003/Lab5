package Lab5_6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SinhVien{
    String Hovaten,MSSV,Lop;
    public SinhVien(String Hovaten,String MSSV,String Lop){
        this.Hovaten=Hovaten;
        this.MSSV=MSSV;
        this.Lop=Lop;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong sinh vien: ");
        do{
        n=sc.nextInt();
        }while(n==0);
        System.out.println("---------------------");
        Map<Integer,SinhVien> A=new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu "+(i+1)+"(Ten,MSSV,Lop): ");
            if(i==0){
                sc.nextLine();
            }
            A.put(i,new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        System.out.println("Bang SinhVien:");
        for(Map.Entry<Integer, SinhVien> B:A.entrySet()){
            System.out.println("Ho ten:"+B.getValue().Hovaten+"\nMSSV: "+B.getValue().MSSV+"\nLop:"+B.getValue().Lop);
        }
        String LopIn,MSSVIn;
        System.out.print("Nhap lop muon in ra: ");
        LopIn=sc.nextLine();
        for(Map.Entry<Integer, SinhVien> C:A.entrySet()){
            if(C.getValue().Lop.equals(LopIn)){
                System.out.println("Ho va ten: "+C.getValue().Hovaten+"\nMSSV: "+C.getValue().MSSV);
            }
    }
        System.out.print("Nhap MSSV muon in ra:");
        MSSVIn=sc.nextLine();
        for(Map.Entry<Integer,SinhVien> D:A.entrySet()){
            if(D.getValue().MSSV.equals(MSSVIn)){
                System.out.println("Ho va ten: "+D.getValue().Hovaten+"\nLop: "+D.getValue().Lop);
            }
        }
    }
}

