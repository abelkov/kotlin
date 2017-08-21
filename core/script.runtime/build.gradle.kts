
import org.gradle.jvm.tasks.Jar

apply { plugin("kotlin") }

dependencies {
    val compile by configurations
    compile(project(":core:builtins"))
    compile(project(":kotlin-stdlib"))
    buildVersion()
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

tasks.withType<Jar> {
    setupRuntimeJar("Kotlin Script Runtime")
    archiveName = "kotlin-script-runtime.jar"
}
