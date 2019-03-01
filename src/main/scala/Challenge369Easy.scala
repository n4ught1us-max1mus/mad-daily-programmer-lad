// https://www.reddit.com/r/dailyprogrammer/comments/a0lhxx/20181126_challenge_369_easy_hex_colors/

object Challenge369Easy {

  def intToHex(int: Int): String = int match {
    case a if int < 10 ⇒ a.toString
    case a if a == 10  ⇒ "A"
    case a if a == 11  ⇒ "B"
    case a if a == 12  ⇒ "C"
    case a if a == 13  ⇒ "D"
    case a if a == 14  ⇒ "E"
    case a if a == 15  ⇒ "F"
  }

  val hexIndex: List[String] = List("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F")

  def convertToHex(i1: Int, i2: Int, i3: Int): String =
    "#" + intToHex(i1/16) + intToHex(i1%16) + intToHex(i2/16) + intToHex(i2%16) + intToHex(i3/16) + intToHex(i3%16)

  def convertToHex2(i1: Int, i2: Int, i3: Int): String =
    "#" + hexIndex(i1/16) + hexIndex(i1%16) + hexIndex(i2/16) + hexIndex(i2%16) + hexIndex(i3/16) + hexIndex(i3%16)

}