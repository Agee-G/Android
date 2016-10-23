package ghost.ghost;

import cn.bmob.v3.BmobObject;

/**
 * Created by G__Agee on 2016/10/7.
 */
public class Person extends BmobObject {
    private String name;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String setPasswd() {
        return address;
    }
    public void setPasswd(String address) {
        this.address = address;
    }
}
