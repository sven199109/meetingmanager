*Conference Track Management*
>非常感谢您在百忙之中抽出时间来阅读我的设计，在此之前我先介绍一下它的运行环境和运行方式。
**您需要的环境**
    该实例是基于maven + java + junit开发的，因此在运用之前，您需要安装JDK v1.6或以上版本以及Maven工具，q我将不去阐述如何
    安装它们，但以下的操作
    我将默认为您已经成功将它们安装。

**运行程序**
    打开Shell并更改工作目录为项目的根目录，然后执行`mvn install`命令执行相关库的安装，安装完成后执行`mvn compile`编译为
    可执行文件，之后我们便可以运行该项目了。输入`mvn test`(这原本是用于测试的，而我在maven中绑定了运行项目到测试中，因此是直
    接使用它来运行程序并查看结果)指令运行程序，在测试结果的后面我们就可以找到项目运行中的输出结
    果了。




