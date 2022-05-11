package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef.http

object GoogleRequests {
  val getHome = http("Google Homepage (/)")
                        .get("/")
}
