package pyxis.uzuki.live.mediaresizer.strategy

class CustomStrategy @JvmOverloads constructor(var longLength: Int, var shortLength: Int, videoBitrate: Int = 8000 * 1000, audioBitrate: Int = -1, audioChannels: Int = -1)
    : FormatStrategy(videoBitrate, audioBitrate, audioChannels) {

    override fun getLongerLength() = longLength
    override fun getShorterLength() = shortLength
    override fun getLogTag(): String = CustomStrategy::class.java.simpleName
}