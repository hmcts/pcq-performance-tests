import java.nio.file.Path
import java.nio.file.Paths

object IDEPathHelper {

	val gatlingConfUrl: Path = Paths.get(getClass.getClassLoader.getResource("gatling.conf").toURI)
	val projectRootDir = gatlingConfUrl.getParent.getParent.getParent

	val mavenSourcesDirectory = projectRootDir.resolveSibling("src").resolveSibling("gatling").resolveSibling("simulations")
	val mavenResourcesDirectory = projectRootDir.resolveSibling("src").resolveSibling("test").resolveSibling("resources")
	val mavenTargetDirectory = projectRootDir.resolve("target")
	val mavenBinariesDirectory = mavenTargetDirectory.resolve("test-classes")

	val resourcesDirectory = mavenResourcesDirectory
	val recorderSimulationsDirectory = mavenSourcesDirectory
	val dataDirectory = mavenResourcesDirectory.resolveSibling("data")
	val bodiesDirectory = mavenResourcesDirectory.resolveSibling("bodies")

	val recorderOutputDirectory = mavenSourcesDirectory
	val resultsDirectory = mavenTargetDirectory.resolve("gatling")

	val recorderConfigFile = mavenResourcesDirectory.resolveSibling("recorder.conf")
}
