package cz.cvut.fel.sin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Configuration

@SpringBootApplication(scanBasePackages = ["cz.cvut.fel.sin"])
@EnableConfigurationProperties
@Configuration
class SinApplication : SpringBootServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(SinApplication::class.java)
    }
}


fun main(args: Array<String>) {
    runApplication<SinApplication>(*args)
}
