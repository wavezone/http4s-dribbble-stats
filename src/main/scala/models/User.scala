package models

case class User(
  id: Long,
  name: String,
  username: String,
  html_url: String,
  avatar_url: String,
  shots_count: Long
)

//object User {
//  implicit val userDecoder: Decoder[User] = deriveDecoder
//  implicit val userEncoder: Encoder[User] = deriveEncoder
//
//}
