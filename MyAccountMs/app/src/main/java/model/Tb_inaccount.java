package model;

/**
 * Created by sunchenhao on 2015/10/25.
 */
public class Tb_inaccount {
    private int _id;
    private double money;
    private String time;
    private String type;
    private String hander;
    private String mark;
    public Tb_inaccount(){
        super();
    }
    public Tb_inaccount(int id,double money,String time,String type,String hander,String mark){
        super();
        this._id = id;
        this.money = money;
        this.time = time;
        this.type = type;
        this.hander = hander;
        this.mark = mark;
    }
    public int getid(){
        return _id;
    }
    public void setid(int id){
        this._id = id;
    }
    public double getMoney(){
        return money;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getHander(){
        return hander;
    }
    public void setHander(String hander){
        this.hander = hander;
    }
    public String getMark(){
        return mark;
    }
    public void setMark(String mark){
        this.mark = mark;
    }
}