package me.leon

import org.junit.jupiter.api.Test

class NetworkSubTest {
    @Test
    fun subParse() {
        val subUrl = "https://gitee.com/bujilangren/warehouse/raw/master/Skr%20HOHOHO.txt"
        val subUrlTr = "https://proxy.51798.xyz/trojan/sub"
        val subUrlV2 = "https://proxy.51798.xyz/vmess/sub"
        val subUrlSsr = "https://proxy.51798.xyz/ssr/sub"
        val subUrlSs = "https://proxy.51798.xyz/sip002/sub"

        listOf(
//            subUrl,
//            subUrlSs,
//            subUrlSsr,
//            subUrlTr,
//            subUrlV2
            "https://raw.fastgit.org/Leon406/jsdelivr/master/subscribe/ss2"
        ).forEach {
            kotlin.runCatching {
                Parser.parseFromSub(it)
                    .joinToString(
//                        "|",
                        "\r\n",
                        transform = Sub::toUri
                    )
                    .also {
                        println("___________")
                        println(it)
                    }
            }.onFailure {
                it.printStackTrace()
            }
        }
    }
}