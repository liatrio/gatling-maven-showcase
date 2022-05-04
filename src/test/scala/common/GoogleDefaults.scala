package common

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GoogleDefaults {
  val httpProtocols = http
      .baseUrl("https://google.com")
}
