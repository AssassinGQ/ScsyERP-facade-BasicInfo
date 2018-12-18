package cn.AssassinG.ScsyERP.BasicInfo.facade.enums;

import java.util.HashMap;
import java.util.Map;

public enum ProductStatus {
    DRK("待入库", 0),YRK("已入库", 1), DCK("待出库", 2), YCK("已出库", 3), YWC("已完成", 4);
    private String Name;
    private Integer Value;

    static Map<String, ProductStatus> enumMap = new HashMap<String, ProductStatus>();
    static{
        for(ProductStatus type : ProductStatus.values()){
            enumMap.put(type.getName(), type);
        }
    }

    private ProductStatus(String name, Integer value) {
        Name = name;
        Value = value;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer value) {
        Value = value;
    }

    public static ProductStatus getEnum(String name){
        return enumMap.get(name);
    }
    static Map<Integer, ProductStatus> intMap = new HashMap<>();
    static{
        for(ProductStatus type : ProductStatus.values()){
            intMap.put(type.getValue(), type);
        }
    }
    public static ProductStatus getEnum(Integer value){
        return intMap.get(value);
    }
}
