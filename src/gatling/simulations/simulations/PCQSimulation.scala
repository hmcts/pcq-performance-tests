package simulations

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import scenarios._
import utils._

import scala.concurrent.duration._

class PCQSimulation extends Simulation {

    val BaseURL = Environment.baseURL
    val PCQiteration = 1

    val httpProtocol = Environment.HttpProtocol
        .baseUrl(BaseURL)
        .doNotTrackHeader("1")

    val PCQScenario = scenario("PCQS")
        .repeat(1) {
            exec(PCQQuestions.pcqJourney)
        }

    setUp(
        PCQScenario.inject(rampUsers(1) during (1 minutes))
    )
    .protocols(httpProtocol)
    .assertions(global.successfulRequests.percent.is(100))
}