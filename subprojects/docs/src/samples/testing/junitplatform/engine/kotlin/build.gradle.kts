plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.0")
    testImplementation ("org.junit.vintage:junit-vintage-engine:5.1.0")
}

// tag::filter-engine[]
tasks.getByName<Test>("test") {
    useJUnitPlatform {
        includeEngines("junit-vintage")
        // excludeEngines("junit-jupiter")
    }
}
// end::filter-engine[]
