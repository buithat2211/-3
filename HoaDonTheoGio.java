import java.time.LocalDate;

public class  HoaDonTheoGio extends HoaDon {
	int gioThue;
	HoaDonTheoGio() {
		
	}
	HoaDonTheoGio(int _maHoaDon, LocalDate _ngayHoaDon,
			String _tenKhachHang, int _maPhong, double _donGia, int _gioThue) {
		maHoaDon = _maHoaDon;
		ngayHoaDon = _ngayHoaDon;
		maPhong = _maPhong;
		donGia = _donGia;
        gioThue = _gioThue;
          
	}

	double tinhGiaTien() {
		if (gioThue > 30) {
			return 0;	
		}
		if (gioThue > 24 && gioThue <= 30) {
			gioThue =24;
		}
		double giaTien ;
		giaTien = donGia * gioThue;
		return giaTien;		
	}
}
