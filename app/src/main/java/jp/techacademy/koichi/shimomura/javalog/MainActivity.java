package jp.techacademy.koichi.shimomura.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // レイアウトファイルを設定する
        setContentView(R.layout.activity_main);

        Human human1 = new Human("木村", 30, "サッカー"); // 名前を「下村」、年齢「44」歳で、Humanのインスタンスを作る

        human1.say();
        human1.think();

        Human human2 = new Human("田中", 20, "ドラマ");

        human2.say();
        human2.think();

    }
}