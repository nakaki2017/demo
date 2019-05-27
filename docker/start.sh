appName="demo"
word="1"
echo "$word"
word=`docker ps -a -q --no-trunc --filter name=^/"$appName"$`
echo "$word"
if [ -z "$word" ];
then
    echo "当前不存在该容器，直接进行启动该操作-------------------------------------"
elif [ -n "$word" ];
then
    echo "当前已存在容器，停止并移除该容器-------------------------------------"
    /usr/bin/docker stop "$word"
    /usr/bin/docker rm "$word"
elif [ "$word" == "1" ];
then
    echo "查询的信息有误，执行默认操作-------------------------------------"
    /usr/bin/docker stop "$word"
    /usr/bin/docker rm "$word"
fi
/usr/local/maven-3.6.0/bin/mvn clean package docker:build
echo /usr/bin/docker run -p 8761:8761 -d --name "$appName" "$appName":latest
/usr/bin/docker run -p 8764:8111 -d --name "$appName" "$appName":latest
