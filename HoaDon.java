import java.time.LocalDate;

public class HoaDon {
	int maHoaDon;
	LocalDate ngayHoaDon;
	String tenKhachHang;
	int maPhong;
	double donGia;
	
	HoaDon() {
		
	}
	
	HoaDon(int _maHoaDon, LocalDate _ngayHoaDon,
			String _tenKhachHang, int _maPhong, double _donGia) {
		maHoaDon = _maHoaDon;
		ngayHoaDon = _ngayHoaDon;
		tenKhachHang = _tenKhachHang;
		maPhong = _maPhong;
		donGia = _donGia;
		
	}
	
	double tinhGiaTien() {
		return 0;
		
	}
	
}
