package flightpoint.frontend

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform