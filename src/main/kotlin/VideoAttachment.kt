import ru.netology.Views

class VideoAttachment:Attachment {
    override val type: String = "Video"

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
}