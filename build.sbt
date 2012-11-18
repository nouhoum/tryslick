organization := "com.nouhoum"

name := "trysclick"

scalaVersion := "2.10.0-RC2"

scalacOptions += "-deprecation"

libraryDependencies ++= List(
  "com.typesafe" % "slick_2.10.0-RC2" % "0.11.2",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.166"
)
