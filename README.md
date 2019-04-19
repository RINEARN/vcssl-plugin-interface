# Plug-in Interfaces for VCSSL/Vnano Script Engines

ー VCSSL/Vnanoスクリプトエンジン用プラグインインターフェース


## Caution - 注意

Specifications of some interfaces provided by this package have not determined yet, so they might be changed.

このパッケージが提供するインターフェースの内のいくつかは、まだ仕様が確定しておらず、今後変更される可能性があります。


## License - ライセンス

This package is released under <a href="https://creativecommons.org/publicdomain/zero/1.0/deed">CC0</a>.

このパッケージは <a href="https://creativecommons.org/publicdomain/zero/1.0/deed.ja">CC0</a> で公開されています。


## How to Use - 使用方法

Copy contents in "src" folder to the source-code folder of your software/plugins, and then import the interface which you want to implement from your code as follows:

「src」フォルダの中身を、開発するソフトウェア/プラグインのソースコードのフォルダ内にコピーしてから、実装したいプラグインのインターフェースを、コード内から以下のように import してください：

    import org.vcssl.connect.ExternalFunctionConnector1;

    public class YourPlugin implements ExternalFunctionConnector1 {
        ...


For more details, please see documents of script engines supporting interfaces of this package, for example: <a href="https://github.com/RINEARN/vnano">Vnano</a>.

詳細は、このパッケージが提供するインターフェースをサポートしているスクリプトエンジン（<a href="https://github.com/RINEARN/vnano">Vnano</a> など）のドキュメントをご参照ください。
