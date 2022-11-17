
package Service.Implement;

import DomainModel.Size;
import RepositoryJdbc.Implement.SizeRepositoryImplement;
import RepositoryJdbc.Interface.SizeRepositoryInterface;
import Service.Interface.SizeServiceInterface;
import java.util.List;



public class SizeServiceimplement implements SizeServiceInterface{
    private SizeRepositoryInterface sizeRepositoryInterface;
    public SizeServiceimplement(){
        sizeRepositoryInterface = new SizeRepositoryImplement();
    }
    @Override
    public List<Size> getAllSize() {
        return sizeRepositoryInterface.getAllSize();
    }
    
}
