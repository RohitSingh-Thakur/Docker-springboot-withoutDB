FROM openjdk:8
EXPOSE 8012
ADD target/docker_springboot_withoutdb.jar docker_springboot_withoutdb.jar
				#Source					   #Destination also we can use . here 	

ENTRYPOINT ["java", "-jar", "docker_springboot_withoutdb.jar"]