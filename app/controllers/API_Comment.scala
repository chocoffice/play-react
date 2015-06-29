package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object API_Comment extends Controller {

  def get = Action {
    val json = Json.parse("""
                          [
  {"author": "Pete Hunt", "text": "This is one comment"},
  {"author": "Jordan Walke", "text": "This is *another* comment"}
]
                          """)
    Ok(json)
  }

  def post = Action { implicit request =>
    request.body.asFormUrlEncoded.fold(
      BadRequest("Illegal parameters")
    ){
      parameters =>
        val json = Json.parse("""
                            [
    {"author": "Pete Hunt", "text": "This is one comment"},
    {"author": "Jordan Walke", "text": "This is *another* comment"},
    {"author": "Added", "text": "This is *another* comment"}
]
                          """)
        Ok(json)
    }
  }
}