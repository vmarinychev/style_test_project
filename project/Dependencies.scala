
import sbt._

object Dependencies {

  def compiledDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Compile)

  def testDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Test)

  object Libraries {
    val pureconfig = "com.github.pureconfig" %% "pureconfig" % "0.17.1"
  }

  object TestDependencies {

  }
}
