data class DocumentAttachment(override val type: String = "document", val document: Document) : Attachment {
}

data class Document(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int
)
