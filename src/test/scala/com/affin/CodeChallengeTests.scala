package com.affin

import org.scalatest.FunSuite

class CodeChallengeTests  extends FunSuite {

  test("Gift challenge with a list of one person") {
    val listPeople = List("Phil")
    val codeChallenge = new CodeChallenge()
    val givenList = codeChallenge.exchangeGift(listPeople)
    println(s"Given list 1 = $givenList")
    assert(givenList.isEmpty == true) // return an empty given list

  }


  test("Gift challenge with a list of two persons") {
    val listPeople = List("Ardi", "Quan")
    val codeChallenge = new CodeChallenge()
    val givenList = codeChallenge.exchangeGift(listPeople)
    println(s"Given list 1 = $givenList")
    assert(givenList.isEmpty == true) // return an empty given list

  }


  test("Gift challenge with a list of five persons") {
    val listPeople = List("Phil", "Stephen", "Ardi", "Quan", "Joe")
    val codeChallenge = new CodeChallenge()
    val givenList = codeChallenge.exchangeGift(listPeople)
    val givenList2 = codeChallenge.exchangeGift(listPeople)
    println(s"Given list 1 = $givenList")
    println(s"Given list 2 = $givenList2")

    assert(givenList.nonEmpty == true)
    assert(givenList.size == 5) // every person gives one gift
    assert(givenList.distinct.size == givenList.size) // all the combinations for givenList1 are unique

    assert(givenList2.nonEmpty == true)
    assert(givenList2.size == 5) // every person gives one gift
    assert(givenList2.distinct.size == givenList.size) // all the combinations for givenList2 are unique

    assert(givenList != givenList2) // the random shuffle generates two different lists

  }


  test("Gift challenge with a list of height persons") {
    val listPeople = List("Phil", "Stephen", "Ardi", "Quan", "Joe", "Malou", "Jim", "Rolland")
    val codeChallenge = new CodeChallenge()
    val givenList = codeChallenge.exchangeGift(listPeople)
    val givenList2 = codeChallenge.exchangeGift(listPeople)
    println(s"Given list 1 = $givenList")
    println(s"Given list 2 = $givenList2")

    assert(givenList.nonEmpty == true)
    assert(givenList.size == 8) // every person gives one gift
    assert(givenList.distinct.size == givenList.size) // all the combinations for givenList1 are unique

    assert(givenList2.nonEmpty == true)
    assert(givenList2.size == 8) // every person gives one gift
    assert(givenList2.distinct.size == givenList.size) // all the combinations for givenList2 are unique

    assert(givenList != givenList2) // the random shuffle generates two different lists

  }
}
