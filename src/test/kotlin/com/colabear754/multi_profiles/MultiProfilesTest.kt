package com.colabear754.multi_profiles

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.env.Environment
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("dev")
class MultiProfilesTest @Autowired constructor(private val environment: Environment) {
    @Test
    fun profileTest() {
        println("===================다중 프로파일 테스트===================")
        println("Active profiles : ${environment.activeProfiles.toList()}")
        println("Datasource driver : ${environment.getProperty("spring.datasource.driver-class-name")}")
        println("Datasource url : ${environment.getProperty("spring.datasource.url")}")
        println("Datasource username : ${environment.getProperty("spring.datasource.username")}")
        println("Datasource password : ${environment.getProperty("spring.datasource.password")}")
        println("Server Port : ${environment.getProperty("server.port")}")
        println("Default Property : ${environment.getProperty("default.string")}")
        println("Common Property : ${environment.getProperty("common.string")}")
        println("====================================================")
    }
}