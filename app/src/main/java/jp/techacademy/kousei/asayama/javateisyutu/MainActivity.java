package jp.techacademy.kousei.asayama.javateisyutu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //インスタンス生成
        Human human = new Human("こうせい", 25, "ゲーム");
        //メソッド
        human.say();
        human.thinkable();

        //インスタンス生成
        Human human2 = new Human("コウセイ", 30, "飲酒");
        //メソッド
        human2.say();
        human2.thinkable();

        //インスタンス生成
        Human human3 = new Human("こーせー", 20, "ツイッター");
        //メソッド
        human3.say();
        human3.thinkable();

    }

}
