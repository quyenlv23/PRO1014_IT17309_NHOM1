
package Service.Implement;

import DomainModel.DanhMuc;
import RepositoryJdbc.Implement.DanhMucRepositoryImplement;
import RepositoryJdbc.Interface.DanhMucRepositoryInterface;
import Service.Interface.DanhMucServiceInterface;
import java.util.List;


public class DanhMucServiceImplement implements DanhMucServiceInterface{
    private DanhMucRepositoryInterface danhMucRepositoryInterface;
    public DanhMucServiceImplement(){
        danhMucRepositoryInterface = new DanhMucRepositoryImplement();
    }
    @Override
    public List<DanhMuc> getallDM() {
        return danhMucRepositoryInterface.getAllDM();
    }
    
}
