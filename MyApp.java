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
    // 変数の定義方法 [END] -----------------------------------------

    // 変数の定義 [END] ==========================================

  }
}
