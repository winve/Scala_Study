package com.itcpay.training

/**
 * 伴生类与伴生对象的apply
 */
object ApplyTest {
  def apply() = {
    println("这是伴生对象的apply方法")
    new ApplyTest
  }
}

class ApplyTest {
  def apply() = println("这是伴生类的apply方法")
}

// 独立对象，作为程序入口
object ApplyInit {
  def main(args: Array[String]): Unit = {
    // 通过伴生对象的apply方法，进行实例化
    val applyTest = ApplyTest()
    // 这是伴生类的apply方法
    applyTest()
  }
}