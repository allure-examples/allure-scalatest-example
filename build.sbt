name := "Allure ScalaTest Example"

organization := "ru.yandex.qatools.allure"

version := "0.0.1"

scalaVersion := "2.10.3"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.1.4" % "test",
  "ru.yandex.qatools.allure" % "allure-scalatest_2.10" % "1.4.0-SNAPSHOT" % "test"
)

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-oD"),
  Tests.Argument(TestFrameworks.ScalaTest, "-C", "ru.yandex.qatools.allure.scalatest.AllureReporter")
)
