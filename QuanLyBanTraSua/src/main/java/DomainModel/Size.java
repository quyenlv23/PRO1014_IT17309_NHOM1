
package DomainModel;


public class Size {
    private String id;
    private String ma;
    private String theTich;

    public Size() {
    }

    public Size(String id, String ma, String theTich) {
        this.id = id;
        this.ma = ma;
        this.theTich = theTich;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTheTich() {
        return theTich;
    }

    public void setTheTich(String theTich) {
        this.theTich = theTich;
    }

    @Override
    public String toString() {
        return "Size{" + "id=" + id + ", ma=" + ma + ", theTich=" + theTich + '}';
    }
    
}
