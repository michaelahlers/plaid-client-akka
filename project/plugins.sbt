resolvers ++=
	Resolver.jcenterRepo ::
		Nil

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.5.10")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0")
addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.19.0")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.1")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

/* TODO: Restore pending ThoughtWorksInc/sbt-api-mappings#8. */
//addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "latest.release")
