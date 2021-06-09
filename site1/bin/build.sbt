lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sb)",

  // orgnization name (e.g., the package name of the project)
  organization := "com.treasure-data",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.1.7.RELEASE",
  	"org.springframework.cloud" % "spring-cloud-starter-sleuth" % "2.1.7.RELEASE",
  	"org.springframework.cloud" % "spring-cloud-starter-zipkin" % "2.1.7.RELEASE",
    "org.springframework.cloud" % "spring-cloud-dependencies" % "Greenwich.SR2" pomOnly()
   ),

  mainClass := Some("example.Main")
)
