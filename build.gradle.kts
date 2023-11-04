plugins {
    java
}

subprojects {
    apply(plugin = "java-library")

    repositories {
        mavenLocal()
        maven {
            url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        }

        maven {
            url = uri("https://repo.maven.apache.org/maven2/")
        }
    }
}