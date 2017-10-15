libraryDependencies ++=
	"com.beachape" %% "enumeratum" % "1.5.12" ::
		"com.chuusai" %% "shapeless" % "2.3.2" ::
		"com.plaid" % "plaid-java" % "2.1.6" ::
		"com.typesafe.akka" %% "akka-stream" % "2.5.6" % Provided ::
		"org.scalactic" %% "scalactic" % "3.0.4" ::
		Nil

libraryDependencies ++=
	"com.typesafe.akka" %% "akka-stream-testkit" % "2.5.6" % Test ::
		"org.mockito" % "mockito-core" % "2.10.0" % Test ::
		"org.scalacheck" %% "scalacheck" % "1.13.4" % Test ::
		"org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % Test ::
		"org.scalatest" %% "scalatest" % "3.0.4" % Test ::
		Nil
