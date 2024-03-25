plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp")
}

version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":test-processor"))
    ksp(project(":test-processor"))
}

ksp {
    arg("option1", "value1")
    arg("option2", "value2")
}
