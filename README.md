# springboot结合graalvm在windows平台生成exe二进制程序
Please make sure that Visual Studio 2022 version 17.1.0 or later is installed on your system. You can download it at https://visualstudio.microsoft.com/downloads/. If this error persists, please try and run GraalVM Native Image in an x64 Native Tools Command Prompt or file a ticket.
![image](https://github.com/user-attachments/assets/bdb50582-8894-48e9-8381-e4079750fb91)
生成二进制文件


graalvm验证方式
java "-Dspring.aot.enabled=true" -jar application.jar

生成依赖配置
java -agentlib:native-image-agent=config-output-dir=src/main/resources/META-INF/native-image -jar target/graalvmDemo-0.0.1-SNAPSHOT.jar

native-image.cmd @target\tmp\native-image-3702991127087336168.args com.example.graalvm.GraalvmDemoApplication
