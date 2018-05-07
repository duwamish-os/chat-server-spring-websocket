name := "chat-server-spring-websocket"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies += "org.springframework.boot" % "spring-boot-starter-websocket" % "2.0.1.RELEASE"
libraryDependencies += "org.webjars" % "webjars-locator-core" % "0.35"
libraryDependencies += "org.webjars.npm" % "sockjs-client" % "1.1.4"
libraryDependencies += "org.webjars" % "stomp-websocket" % "2.3.3"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.5"
libraryDependencies += "org.webjars" % "jquery" % "3.1.0"

resolvers += "mvn central" at "http://central.maven.org/maven2/"
resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"