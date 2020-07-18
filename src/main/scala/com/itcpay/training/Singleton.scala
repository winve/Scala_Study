package com.itcpay.training

/**
 * 单例对象
 */
object Singleton {
  private val name: String = "tom"

  def getName: Unit = {
    println("My name is " + name)
  }
}

object Init {
  def main(args: Array[String]): Unit = {
    // 直接调用 Singleton 的 getName 方法即可
    Singleton.getName
  }
}
