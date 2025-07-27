import org.jetbrains.kotlin.konan.properties.Properties

version =6 

android {
    defaultConfig {
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())
        android.buildFeatures.buildConfig=true
        buildConfigField("String", "CONSUMET_API", "\"${properties.getProperty("CONSUMET_API")}\"")
        buildConfigField("String", "SIMKL_API", "\"${properties.getProperty("SIMKL_API")}\"")
    }
}

cloudstream {
    // language = "id"
    description = "Include: Donghuaword"
    authors = listOf("megix")
    status = 1
    tvTypes = listOf(
        "AnimeMovie",
        "Anime",
    )

    iconUrl = "https://github.com/SaurabhKaperwan/CSX/raw/refs/heads/master/CineStream/icon.jpg"
}
