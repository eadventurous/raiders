name := "raiders"

version := "0.1"

scalaVersion := "2.13.1"

val http4sVersion = "0.21.2"
val doobieVersion = "0.8.8"

addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")

libraryDependencies ++= Seq(
  "org.http4s"            %% "http4s-dsl"          % http4sVersion,
  "org.http4s"            %% "http4s-blaze-server" % http4sVersion,
  "org.http4s"            %% "http4s-blaze-client" % http4sVersion,
  "org.typelevel"         %% "cats-core"           % "2.0.0",
  "org.typelevel"         %% "cats-effect"         % "2.1.2",
  "org.scalatest"         % "scalatest_2.13"       % "3.1.1" % "test",
  "org.http4s"            %% "http4s-circe"        % http4sVersion,
  "io.circe"              %% "circe-generic"       % "0.13.0",
  "io.circe"              %% "circe-literal"       % "0.13.0",
  "org.tpolecat"          %% "doobie-core"         % doobieVersion,
  "org.tpolecat"          %% "doobie-postgres"     % doobieVersion,
  "com.github.pureconfig" %% "pureconfig"          % "0.12.3",
)
