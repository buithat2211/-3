import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	int soNgayThue;
	
	HoaDonTheoNgay () {
		
	}
	HoaDonTheoNgay( int _maHoaDon, LocalDate _ngayHoaDon,
			String _tenKhachHang, int _maPhong, double _donGia, int _soNgayThue) {
		maHoaDon = _maHoaDon;
		ngayHoaDon = _ngayHoaDon;
		maPhong = _maPhong;
		donGia = _donGia;
		soNgayThue = _soNgayThue;
		
	}

	double tinhGiaTien() {
		double giaTien;
		if (soNgayThue > 7) {
			giaTien = donGia * soNgayThue * 0.8; // giảm 20% nếu thuê trên 7 ngày
		}
		giaTien = donGia * soNgayThue;
		return giaTien;
	}
}
