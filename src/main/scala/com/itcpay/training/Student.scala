package com.itcpay.training

/**
 * 伴生对象
 */
object Student {
  // 学号
  private val id: Int = 1

  // 定义apply方法，实例化伴生类
  def apply(name: String, address: String): Student = new Student(name, address)

  def main(args: Array[String]): Unit = {
    // 实例化对象tom
    val tom = new Student("tom", "北京")
    // 获取伴生类的私有成员school
    println("获取伴生类的私有成员" + tom.school)
    // 获取伴生对象的私有成员id
    tom.getID
    println("我叫" + tom.name + "，住在" + tom.address + "，在" + tom.school + "上学，学号是" + id)

    println("***** apply *****")
    // 通过伴生对象的 apply 方法创建实例
    val jerry = Student("jerry", "上海")
    println("获取伴生类的私有成员" + jerry.school)
    jerry.getID
    println("我叫" + jerry.name + "，住在" + jerry.address + "，在" + jerry.school + "上学，学号是" + id)
  }
}

/**
 * 伴生类
 */
class Student(var name: String, var address: String) {
  // 学校
  private val school = "no.1 middle school"

  // 调用伴生对象的私有成员
  def getID: Unit = {
    println("获取伴生对象的私有成员" + Student.id)
  }
}
