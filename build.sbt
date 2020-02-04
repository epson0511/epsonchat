name := """epsonchat"""
organization := "jj"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaWs,
  ehcache,
  "org.mybatis" % "mybatis" % "3.4.1",        
  "org.mybatis" % "mybatis-guice" % "3.8",
  "com.google.inject.extensions" % "guice-multibindings" % "4.1.0",
  "org.mariadb.jdbc" % "mariadb-java-client" % "1.4.6"
)

libraryDependencies += guice

// https://mvnrepository.com/artifact/commons-configuration/commons-configuration
libraryDependencies += "commons-configuration" % "commons-configuration" % "1.10"


// Compile the project before generating Eclipse files, so
// that generated .scala or .class files for views and routes are present

EclipseKeys.preTasks := Seq(compile in Compile, compile in Test)



