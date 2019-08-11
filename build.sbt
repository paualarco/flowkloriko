name := "Flowklorico"

version := "0.1"

scalaVersion := "2.11.12"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Xexperimental"
)

scalacOptions in Test += "-Ywarn-value-discard:false" // since this often appears in expectNext(expected) testing style in streams

val akkaVersion = "2.5.23"
val akkaHttpVersion = "10.1.8"

libraryDependencies ++= Seq(
  "org.scalacheck"           %% "scalacheck"               % "1.13.5"    % Test,
  "org.scalatest"            %% "scalatest"                % "3.0.8"     % "test",
  "com.typesafe.akka"        %% "akka-stream"              % akkaVersion,
  "com.typesafe.akka"        %% "akka-http"                % akkaHttpVersion,
  "com.typesafe.akka"        %% "akka-testkit"             % akkaVersion  % Test,
  "com.typesafe.akka"        %% "akka-http-spray-json"     % "10.1.9",
  "com.typesafe.akka"        %% "akka-remote"              % akkaVersion,
  "org.apache.spark"         %% "spark-core"               % "2.4.0",
  "org.apache.spark"         %% "spark-streaming"          % "2.4.0",
  "org.apache.spark"         %% "spark-hive"               % "2.4.0")


mainClass in (Compile, run) := Some("WebServer")

parallelExecution in Test := false
