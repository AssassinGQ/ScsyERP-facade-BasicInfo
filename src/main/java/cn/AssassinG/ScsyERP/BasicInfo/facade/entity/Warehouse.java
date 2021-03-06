package cn.AssassinG.ScsyERP.BasicInfo.facade.entity;

import cn.AssassinG.ScsyERP.common.annitations.Valid;
import cn.AssassinG.ScsyERP.common.entity.UnLoginableEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Warehouse extends UnLoginableEntity {
    private static final long serialVersionUID = -6065069926465970351L;
    @Valid(varType = Valid.VarType.String, maxLength = 100)
    private String Address;
    @Valid(varType = Valid.VarType.Number, minLength = 20, maxLength = 20)
    private Long Admin;
    private Set<Long> LiftWorkers;
    private Set<Long> DriveWorkers;

    public Warehouse() {
        super();
        //todo 去掉次两行，并在biz中初始化这两个字段
        this.LiftWorkers = new HashSet<>();
        this.DriveWorkers = new HashSet<>();
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Long getAdmin() {
        return Admin;
    }

    public void setAdmin(Long admin) {
        Admin = admin;
    }

    public Set<Long> getLiftWorkers() {
        return LiftWorkers;
    }

    public void setLiftWorkers(Set<Long> liftWorkers) {
        if(this.LiftWorkers == null)
            this.LiftWorkers = new HashSet<>();
        else
            LiftWorkers = liftWorkers;
    }

    public Set<Long> getDriveWorkers() {
        return DriveWorkers;
    }

    public void setDriveWorkers(Set<Long> driveWorkers) {
        if(driveWorkers == null)
            this.DriveWorkers = new HashSet<>();
        else
            DriveWorkers = driveWorkers;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "Address='" + Address + '\'' +
                ", Admin=" + Admin +
                ", LiftWorkers=" + LiftWorkers +
                ", DriveWorkers=" + DriveWorkers +
                ", Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Id=" + Id +
                ", Corporation=" + Corporation +
                ", CreateTime=" + CreateTime +
                ", UpdateTime=" + UpdateTime +
                ", DeleteTime=" + DeleteTime +
                ", IfDeleted=" + IfDeleted +
                '}';
    }
}
