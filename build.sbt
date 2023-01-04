
import Dependencies.{compiledDependencies,testDependencies}
import Dependencies.Libraries._
import Dependencies.TestDependencies._

name := "style_test_project"
version := "1.0"

scalaVersion := "2.13.6"

libraryDependencies ++= compiledDependencies(
  pureconfig
) ++ testDependencies(

)
