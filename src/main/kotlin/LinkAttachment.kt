data class LinkAttachment(override val type: String = "Link", val link: Link) : Attachment {
}


data class Link(
    val url: String,
    val title: String,
    val caption: String,
    val description: String
)
