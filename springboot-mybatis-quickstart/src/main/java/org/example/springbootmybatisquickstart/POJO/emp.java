package org.example.springbootmybatisquickstart.POJO;

/*
POJO（Plain Ordinary Java Object 简单Java对象）
实际就是普通Java Bean，
POJO的内在含义是指：一个常规的、不受任何框架、平台的约束和限制的Java对象。

除了遵守Java语法，它不应该继承预先设定的类、实现预先设定的接口或者包含预先指定的注解。
可以认为，如果一个模块定义的对象皆为POJO，那么除了依赖JDK，它不会依赖任何框架或平台。

通俗的理解，POJO仅包含自身的属性以及自身属性的getter和setter方法，
这意味者POJO可以方便的从一个框架迁移到另一个框架中，或者框架升级也会对代码毫无影响，因此而得到复用。
*/


//用户表
public class emp {
    private Integer id;
    private String workNo;
    private String name;
    private String gender;
    private Short age;
    private String idCard;

    public emp() {
    }

    @Override
    public String toString() {
        return "emp{" +
                "id=" + id +
                ", workNo='" + workNo + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public emp(Integer id, String workNo, String name, String gender, Short age, String idCard) {
        this.id = id;
        this.workNo = workNo;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.idCard = idCard;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}


