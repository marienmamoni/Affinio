package com.affin

import scala.collection.mutable.ListBuffer

class CodeChallenge {

  def exchangeGift(listPeople: List[String]): List[(String, String)] = {

    val givenListBuff = new ListBuffer[(String, String)]()
    if(listPeople.size > 2) { // can not receive a gift from the same person, so must be at least two people
      val listPeopleShuffled = util.Random.shuffle(listPeople)
      println(s"List people before = ${listPeople} and list people after shuffle = ${listPeopleShuffled}")
      listPeopleShuffled.zipWithIndex.foreach { case (per, idx) =>
        if(per == listPeopleShuffled.last) {
          givenListBuff += Tuple2(per, listPeopleShuffled(0))

        } else {
          givenListBuff += Tuple2(per, listPeopleShuffled(idx + 1))
        }
      }
    }
    givenListBuff.toList
  }
}
