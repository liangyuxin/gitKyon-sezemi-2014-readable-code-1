仕様1:
コマンド: java Readable (no argument)
output: オムライス


仕様3:
コマンド: java Readable [file name (String)]
output: 指定したファイルの1行目のレシピを出力
読み込みエラーの場合は"READ ERROR: file name"を出力
読み込むファイルはANSI


仕様4:
コマンド: java Readable [file name (String)]
output: 指定したファイルの全てのレシピを出力
読み込みエラーの場合は"READ ERROR: file name"を出力
読み込むファイルはANSI


仕様5:
コマンド: java Readable [file name (String)]
output: 指定したファイルの全てのレシピにidをふって順に出力
読み込みエラーの場合は"READ ERROR: file name"を出力
読み込むファイルはANSI

Recipeクラス
フィールド:
private int id			レシピのidを定義
private String name		レシピの名前を定義
コンストラクタ：
Recipe(int id, String name)
メソッド:
int getID()			レシピのidを取り出し
int getName()			レシピの名前を取り出し
String toString()		"id: name"の形式で出力


仕様6:
コマンド: java Readable [file name (String)]([id (int)])
output： idを指定した場合そのidのレシピをid付きで表示, 指定しない場合は全てのレシピをid付きで表示
読み込みエラーの場合は"READ ERROR: file name"を出力
読み込むファイルはANSI
存在しないidを指定した場合は何も出力されません


Recipeクラス
フィールド:
private int id			レシピのidを定義
private String name		レシピの名前を定義
コンストラクタ：
Recipe(int id, String name)
メソッド:
int getID()			レシピのidを取り出し
int getName()			レシピの名前を取り出し
String toString()		"id: name"の形式で出力


仕様7:
コマンド: java Readable [file name (String)]([id (int)])
output： idを指定した場合そのidのレシピをid付きで表示, 指定しない場合は全てのレシピをid付きで表示
読み込みエラーの場合は"READ ERROR: file name"を出力
読み込むファイルはANSI
ファイル形式：各行が「レシピ名＋url」
存在しないidを指定した場合は何も出力されません

Recipeクラス
フィールド:
private int id			レシピのidを定義
private String name		レシピの名前を定義
コンストラクタ：
Recipe(int id, String name)
メソッド:
int getID()			レシピのidを取り出し
int getName()			レシピの名前を取り出し
String toString()		"id: name"の形式で出力

仕様8:
コマンド: java Readable [file name (String)]([id (int)]) ([user name (String)])

output： idを指定した場合そのidのレシピをid付きで表示, 指定しない場合は全てのレシピをid付きで表示
レシピを集めたユーザーの名前を表示.ユーザー名を指定しない場合は仕様7の状態で動きます。

読み込みエラーの場合は"READ ERROR: file name"を出力
読み込むファイルはANSI
ファイル形式：各行が「レシピ名＋url」
存在しないidを指定した場合は何も出力されません
ユーザー名に使える文字は次の通りとします。

    小文字のアルファベット
    数字
    ハイフン
    アンダーバー

ユーザー名は長くても10文字とします。

Recipeクラス
フィールド:

private int id			レシピのidを定義
private int user		レシピのuser名を定義
private String name		レシピの名前を定義

コンストラクタ：
Recipe(int id, String name)

メソッド:
int getID()			レシピのidを取り出し
int getName()			レシピの名前を取り出し
int getUser()			レシピのユーザー名を取り出し
String toString()		"id: name"の形式で出力










