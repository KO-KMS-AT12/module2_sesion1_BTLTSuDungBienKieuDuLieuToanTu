import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    //Bài 1: Viết chương trình nhập điểm của một sinh viên cho các môn: Vật lý, Hóa học, và Sinh học.
    //Sau đó hiển thị điểm trung bình và tổng của những điểm này.

    //Bài 2:  Viết chương trình nhập một giá trị là độ 0C (Celsius) và chuyển nó sang độ 0F (Fahrenheit).
    // [Hướng dẫn: C/5 = (F-32)/9]

    //Bài 3: Viết chương trình tính diện tích và chu vi hình tròn.

    //Bài 4: Viết chương trình cho phép nhập vào năm sinh của một người và tính được tuổi của người đó.

    public static void main(String[] args) {
//        bai1();
//        bai2();
//        bai3();
//        bai4();
    }

    //---------Bai 1 ---------------

    static void bai1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem Ly: ");
        float diemLy = scanner.nextFloat();
        System.out.print("Nhap diem Hoa: ");
        float diemHoa = scanner.nextFloat();
        System.out.print("Nhap diem Sinh: ");
        float diemSinh = scanner.nextFloat();

        System.out.println("Diem trung binh : " + tinhTB(diemLy, diemHoa, diemSinh));

        System.out.println("Tong diem : " + tinhTong(diemLy, diemHoa, diemSinh));

    }

    static float tinhTB(float diemLy, float diemHoa, float diemSinh) {
        float diemTB = (diemLy + diemHoa + diemSinh) / 3;
        DecimalFormat df = new DecimalFormat("0.00");
        String str = df.format(diemTB);
        float result = Float.valueOf(str);
        return result;
    }

    static float tinhTong(float diemLy, float diemHoa, float diemSinh) {
        float tongDiem = diemLy + diemHoa + diemSinh;
        DecimalFormat df = new DecimalFormat("0.00");
        String str = df.format(tongDiem);
        float result = Float.valueOf(str);
        return result;
    }

    //-------------Bai 2---------------------

    static void bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nhiet do (do C) : ");
        float doC = scanner.nextFloat();
        System.out.println("Chuyen " + doC + " sang do F la : " + chuyenDoi(doC));
    }

    static float chuyenDoi(float doC) {
        float doF = ((9 * doC) + 160) / 5;
        return doF;
    }

    //----------Bai 3-----------------

    static void bai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron : ");
        float r = scanner.nextFloat();
        System.out.println("Dien tich hinh tron: " + sCircle(r));
        System.out.println("Chu vi hinh tron: " + cCircle(r));

    }

    static float sCircle(float r) {
        float s = (float) (r * r * Math.PI);
        DecimalFormat df = new DecimalFormat("0.00");
        String str = df.format(s);
        float result = Float.valueOf(str);
        return result;
    }

    static float cCircle(float r) {
        float c = (float) (2 * r * Math.PI);
        DecimalFormat df = new DecimalFormat("0.00");
        String str = df.format(c);
        float result = Float.valueOf(str);
        return result;
    }

    //------Bai 4 -------------
    static void bai4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao nam sinh cua ban: ");
        int year = scanner.nextInt();
        System.out.println("Tuoi cua ban la: " + tinhTuoi(year));

    }

    static int tinhTuoi(int year) {
        Calendar calendar = new GregorianCalendar();
        int yearNow = calendar.get(Calendar.YEAR);
        int age = yearNow - year;

        return age;
    }

}
