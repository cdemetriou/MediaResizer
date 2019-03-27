package pyxis.uzuki.live.mediaresizer.strategy

class AS1TO1Strategy @JvmOverloads constructor(videoBitrate: Int = 8000 * 1000, audioBitrate: Int = -1, audioChannels: Int = -1)
    : FormatStrategy(videoBitrate, audioBitrate, audioChannels) {

    override fun getLongerLength(): Int = 720
    override fun getShorterLength(): Int = 720
    override fun getLogTag(): String = AS1TO1Strategy::class.java.simpleName
}