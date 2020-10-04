// Javaを実行するにはclassとその中にメインメソッドが必要。
//クラス部分
class MyApp {
  // メソッド部分
  public static void main(String[] args) {
    // 処理部分
    // System.out.println()はjavascriptのconsole.logのようなもの
    // Javaでは文の終わりにセミコロンをつけるのを忘れないように。
    // System.out.println("javaの学習を開始");
    // 数値を扱う場合はクオーテーションで囲まない。
    // System.out.println(2);
    // 計算も可能
    // System.out.println(2 + 3);
    // 掛け算
    // System.out.println(10 * 7);
    // 割り算
    // System.out.println(9 / 3);
    // 余りを表示
    // System.out.println(10 % 7);
    // 文字列として認識
    // System.out.println("10 - 7");
    // 文字列の連結
    // System.out.println("10" + "7");
    // 変数の定義 [START] ========================================
    // データ型について [START] ---------------------------------------
    // 文字列 = String型
    // 整数 = int型
    // データ型について [END] -----------------------------------------
    // 変数の定義方法 [START] ---------------------------------------
    // int型 の変数の定義
    // int number;
    // 変数に代入
    // number = 3;
    // 変数の定義と代入をする。これを「変数の初期化」と呼ぶ
    int number = 3;
    // 変数の更新 [START] ---------------------------------------
    // 同じ処理の中で同一の変数を定義できないため、変数を更新するときはデータ型をつけない事！ ✖️ int number = 5;
    number = 5;
    // 変数の更新 [END] -----------------------------------------

    System.out.println(number);
    System.out.println(number + 5);
    // String型 の変数の定義
    // String name;
    // 変数に代入
    // name = "matsumoto";
    // 変数の定義と代入をする。これを「変数の初期化」と呼ぶ
    String greeting = "こんにちは";
    String name = "Matsumoto";
    System.out.println(name);
    System.out.println(greeting + name + "さん");
    // 自己代入 [START] ========================================
    // 変数を定義
    int x = 3;
    // 変数に2を足して更新する
    x = x + 2;
    // 結果５
    System.out.println(x);
    // 自己代入 [END] ==========================================
    // 少数を扱う [START] ========================================
    // 少数を扱う数 = double型
    // 小数点が入らない数字（整数） = int型
    double number2 = 5.28;
    System.out.println(number);
    // 強制方変換について
    int number3 = 13;
    int number4 = 4;
    // 結果が3になり、3.25にならない
    System.out.println(number3 / number4);
    // 割り算などで正確な小数点込みの計算を求めるような場合、強制的に型変換を行う。これをキャストと呼ぶ。
    // int型同士の計算で、最終的にdoubleの計算結果を得たい場合、どちらか一つをキャストする。
    System.out.println((double)number3 / number4);
    // 少数を扱う [END] ==========================================
  }
}
