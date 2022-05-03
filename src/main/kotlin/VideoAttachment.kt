data class VideoAttachment(override val type: String = "video", val video: Video) : Attachment {
}

data class Video(
    val vid: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val url: String,
    val addingDate: Int,
    val views: Int,
    val comment: Int,
    val player: String
)
