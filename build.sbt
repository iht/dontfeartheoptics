name := "candy"

scalaVersion := "2.12.3"

organization := "org.hablapps"

resolvers ++= Seq("Speech repo - snapshots" at "http://repo.hablapps.com/snapshots")

val scalazVersion = "7.2.15"

val monocleVersion = "1.5.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.scalaz" %% "scalaz-effect" % scalazVersion,
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.github.julien-truffaut" %% "monocle-core" % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-generic" % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-state" % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-refined" % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-unsafe" % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-law" % monocleVersion % "test"
)

addCompilerPlugin("org.scalamacros" %% "paradise" % "2.1.0" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Ypartial-unification",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:higherKinds")
