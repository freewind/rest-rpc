lazy val commonSettings = Seq(
  organization := "thoughtworks.scala",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.6.4" % "test")

lazy val rpc = (project in file(".")).
  aggregate(core, play).
  settings(commonSettings: _*).
  settings(
    name := "rpc"
  )

lazy val core = project.in(file("rest-rpc-core")).
  settings(commonSettings: _*).settings(
    name := "core"
  )

lazy val play = project.
  dependsOn(core).
  in(file("rest-rpc-play")).
  settings(commonSettings: _*).
  settings(name := "play")

lazy val sample = project.
  in(file("rest-rpc-sample")).
  settings(commonSettings: _*).
  settings(name := "sample")

lazy val sbt_rest_rpc = project.
  in(file("sbt-rest-rpc")).
  settings(commonSettings: _*).
  settings(name := "sbt_rest_rpc")