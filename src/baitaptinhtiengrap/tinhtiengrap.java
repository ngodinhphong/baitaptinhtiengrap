package baitaptinhtiengrap;

import java.util.Scanner;

public class tinhtiengrap {
	public static void main(String[] args) {
		// code đầu vào
		int loaiXe;
		double km, tgCho;
		Scanner scan = new Scanner(System.in);
		
		// code xử lý
		
		do {
			System.out.println("Vui lòng nhập loại xe: \n1: GRAP CAR \n2: GRAP SUV \n3: GRAP BLACK");
			loaiXe = scan.nextInt();
			if(loaiXe != 1 && loaiXe != 2 && loaiXe != 3) {
				System.out.println("Vui lòng nhập đúng loại xe");
			}
			
		}while(loaiXe != 1 && loaiXe != 2 && loaiXe != 3);
			
		do {
			System.out.println("Vui lòng nhập số kilomet:");
			km = scan.nextDouble();
			System.out.println("Vui lòng nhập thời gian chờ (phút): ");
			tgCho = scan.nextDouble();
			if(km < 0 || tgCho < 0 ) {
				System.out.println("Vui lòng nhập lại số liệu cho đúng");
			}
			
		}while(km < 0 || tgCho < 0 );
		
		int tienKM = tientheoKM(km, loaiXe);
		int tienTG = tienTheoTG(tgCho, loaiXe);
		int tongTien = tienKM + tienTG;
		// code đầu ra
		System.out.println("Tiền phải trả là: " + tongTien + "đồng");
		

	}
	
	public static int tientheoKM(double km, int loaiXe) {
		double tienPhaiTra = 0;
		switch (loaiXe) {
		case 1:
			if(km < 1) {
				tienPhaiTra = km * 8000;
			}else if(km > 1 && km <= 19) {
				tienPhaiTra = 8000 +(km - 1) * 7500;
			}else if(km > 19) {
				tienPhaiTra = 8000 + 18 * 7500 + (km - 19) * 7000;
			}
			
			break;
			
		case 2:
			if(km < 1) {
				tienPhaiTra = km * 9000;
			}else if(km > 1 && km <= 19) {
				tienPhaiTra = 9000 +(km - 1) * 8500;
			}else if(km > 19) {
				tienPhaiTra = 9000 + 18 * 8500 + (km - 19) * 8000;
			}
			
			break;
			
		case 3:
			if(km < 1) {
				tienPhaiTra = km * 10000;
			}else if(km > 1 && km <= 19) {
				tienPhaiTra = 10000 +(km - 1) * 9500;
			}else if(km > 19) {
				tienPhaiTra = 10000 + 18 * 9500 + (km - 19) * 9000;
			}
			
			break;

		default:
			System.out.println("Vui lòng nhập đúng dữ liệu yêu cầu");
			break;
		}return (int) tienPhaiTra;
		
	}
	
	public static int tienTheoTG(double tgCho, int loaiXe) {
		int tienPhaiTra = 0;
		switch (loaiXe) {
		case 1:
			if(tgCho <=3) {
				tienPhaiTra = 0;
			}else if(tgCho > 3) {
				tienPhaiTra = (int) (tgCho / 3) * 2000;
			}
			
			break;
			
		case 2:
			if(tgCho <=3) {
				tienPhaiTra = 0;
			}else if(tgCho > 3) {
				tienPhaiTra = (int) (tgCho / 3) * 3000;
			}
			
			break;
			
		case 3:
			if(tgCho <=3) {
				tienPhaiTra = 0;
			}else if(tgCho > 3) {
				tienPhaiTra = (int) (tgCho / 3) * 3500;
			}
			
			break;

		default:
			System.out.println("Vui lòng nhập đúng dữ liệu yêu cầu");
			break;
		}
		
		return (int) tienPhaiTra;
	}

}
