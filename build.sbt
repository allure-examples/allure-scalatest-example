name := "Allure ScalaTest Example"

organization := "ru.yandex.qatools.allure"

version := "0.0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.1.4" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc(),
  "ru.yandex.qatools.allure" % "allure-scalatest_2.10" % "1.3.8-SNAPSHOT" % "test"
)

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-oD"),
  Tests.Argument(TestFrameworks.ScalaTest, "-C", "ru.yandex.qatools.allure.scalatest.AllureReporter")
)