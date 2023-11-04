import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

val projectGroup = property("group") as String
val libsPackage = property("libsPackage") as String
val projectVersion = property("version") as String

dependencies {
    api("com.dumptruckman.minecraft:BukkitPlugin:1.3-SNAPSHOT")
    compileOnly("org.bukkit:bukkit:1.13.2-R0.1-SNAPSHOT")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(11))
        }
    }
    shadowJar {
        archiveClassifier.set("")
        archiveFileName.set("ChestRestock-${projectVersion}.jar")

        //destinationDirectory.set(file("C:\\Users\\yiyo_\\Desktop\\TestServer\\plugins"))
        destinationDirectory.set(file("$rootDir/bin/"))

        relocate("com.strixmc.acid", "${libsPackage}.acid")
        relocate("org.intellij", "${libsPackage}.annotations")
        relocate("dev.triumphteam.cmd", "${libsPackage}.command")
        relocate("team.unnamed.inject", "${libsPackage}.inject")
        relocate("org.checkerframework", "${libsPackage}.checker")
        relocate("dev.dejvokep.boostedyaml", "${libsPackage}.acid")
    }
    processResources {
        filesMatching("**/*.yml") {
            filter<ReplaceTokens>(
                "tokens" to mapOf("version" to projectVersion)
            )
        }
    }
}