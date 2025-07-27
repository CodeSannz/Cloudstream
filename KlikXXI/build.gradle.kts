import org.jetbrains.kotlin.konan.properties.Properties

version =20 

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
    description = "KlikXXI is a movie streaming service that provides the experience of watching hundreds of Box Office films."
    authors = listOf("megix")
    status = 1
    tvTypes = listOf(
        "Movie Terbaru",
        "Korea Movie",
        "India Movie",
    )

    iconUrl = "https://github.com/SaurabhKaperwan/CSX/raw/refs/heads/master/CineStream/icon.jpg"
}
