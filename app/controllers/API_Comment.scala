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

  def post = Action {
    Ok(views.html.react())
  }
}