
public class CXStrorage {
 CXStrorage() {
 }
 void insertChuyenXeNoiThanh(ChuyenXeNoiThanh cx) {
	 MemoryCXDB.addChuyenXeNoiThanh(cx);
 }
 void insertChuyenXeNgoaiThanh(ChuyenXeNgoaiThanh cx) {
	MemoryCXDB.addChuyenXeNgoaiThanh(cx);
 }

}
