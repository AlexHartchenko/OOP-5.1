package ru.netology

import Attachment

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

data class Post(
    var id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(),
    val copyright: String = "",
    val likes: Likes = Likes(),
    val repost: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: String = "",
    val signerId: Boolean = false,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(),
    val postponedId: Int = 0,
    val postSource: PostSource? = PostSource(),
    val geo: Geo? = Geo(),
    val copyHistory: Array<Reposts> = emptyArray(),
    val attachments: Array<Attachment> = emptyArray()
)

data class Comments(
    val count: Int = 0,
    val canPost: Boolean = false,
    val groupCanPost: Boolean = false,
    val canClose: Boolean = false,
    val canOpen: Boolean = false
)

data class Likes(
    val count: Int = 0,
    val userLikes: Boolean = false,
    val canLikes: Boolean = false,
    val canPublish: Boolean = false
)

data class Reposts(
    val count: Int = 0,
    val userReposted: Boolean = false,
)

data class Views(
    val count: Int = 0,
)

data class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 0,
    val placeHolder: String = "",
    val canPublishFreeCopy: Boolean = false,
    val editMode: String = ""
)

data class PostSource(
    val type: String = "",
    val platform: String = "",
    val data: String = "",
    val url: String = ""
)

data class Geo(
    val type: String = "",
    val coordinates: String = "",
    val place: String = ""
)
