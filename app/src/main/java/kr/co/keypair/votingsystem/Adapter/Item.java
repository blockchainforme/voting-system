package kr.co.keypair.votingsystem.Adapter;

public class Item {
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String name5;
    private String times;
    private int num;
    private int image1;
    private int image2;

    public String getName1() {
        return name1;
    }
    public void setName1(String name1) { this.name1 = name1; }

    public String getName2() {
        return name2;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }
    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }
    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }
    public void setName5(String name5) {
        this.name5 = name5;
    }

    public int getNum() { return num;}
    public void setNum(int num){this.num = num;}

    public int getImage1(){ return image1; }
    public int getImage2(){ return image2; }

    public void setImage1(int image1){ this.image1= image1; }
    public void setImage2(int image2){ this.image2= image2; }

}
