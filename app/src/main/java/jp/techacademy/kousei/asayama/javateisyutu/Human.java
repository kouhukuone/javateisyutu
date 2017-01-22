package jp.techacademy.kousei.asayama.javateisyutu;

import android.util.Log;

//Animalクラスを継承、Thinkableインタフェースを実装
class Human extends Animal implements Thinkable {
    //クラス変数
    static String to_jp = "人間";

    //メンバ変数
    String hobby;

    //コンストラクタ
    public Human(String name,int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //メンバ関数
    @Override
    public void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void thinkable(){
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
