# 体质指数微服务应用

# 运行
使用IntelliJ

1. 启动Service Center
2. 运行CalculatorApplication
3. 运行GatewayApplication

使用mvn
1. 启动Service Center
2. cd calculator; mvn spring-boot:run
3. cd webapp; mvn spring-boot:run

# 测试

1. 打开127.0.0.1:8888
2. 输入身高、体重
3. 点击“Submit”

# 构建
1. 构建可执行jar包

        mvn clean package -Pdocker -Ddocker.skip=true
2. 构建docker镜像

        mvn clean package -Pdocker
3. 构建华为云版本的jar包

        mvn clean package -PHuaweiCloud -Pdocker -Ddocker.skip=true
4. 构建华为云版本的镜像
 
        mvn clean package -PHuaweiCloud -Pdocker