# online-taxi-public
## api-passenger

## Nacos注册中心，[官网](https://nacos.io/zh-cn/index.html)
### Mac本地启动Nacos遇到的坑
> incompatible architecture (have (x86_64), need (arm64e))) 报错

nacos2.x不支持使用zulu版本的jdk，需要下载Oracle版本的jdk，[下载地址](https://www.injdk.cn/)

下载安装后，在nacos的bin目录下的startup.sh文件中，添加如下内容
```shell
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_341.jdk/Contents/Home
```
配置好后，重启nacos即可解决。
本地启动nacos后，访问http://localhost:8848/nacos，输入账号密码：nacos/nacos即可登录.

> Failed to create database ‘/data/soft/nacos/data/derby-data’

删除报错信息中的’/data/nacos/data/derby-data’目录，重新启动即可。
