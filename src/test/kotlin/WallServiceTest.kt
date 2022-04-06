import org.junit.Test

import org.junit.Assert.*
import ru.netology.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val post = Post(
            id = 1,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = Comments(),
            copyright = "",
            likes = Likes(),
            repost = Reposts(),
            views = Views(),
            postType = "",
            signerId = false,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(),
            postponedId = 0
        )

        service.add(post)

        assertTrue(post.id != 0)
    }

    @Test
    fun update_existId() {
        val service = WallService()
        service.add(Post(
            id = 1,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = Comments(),
            copyright = "",
            likes = Likes(),
            repost = Reposts(),
            views = Views(),
            postType = "",
            signerId = false,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(),
            postponedId = 0
        ))
        service.add(Post(
            id = 1,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = Comments(),
            copyright = "",
            likes = Likes(),
            repost = Reposts(),
            views = Views(),
            postType = "",
            signerId = false,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(),
            postponedId = 0
        ))
        val update = Post(id = 2)

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun update_notExistId() {
        val service = WallService()
        service.add(Post(
            id = 1,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = Comments(),
            copyright = "",
            likes = Likes(),
            repost = Reposts(),
            views = Views(),
            postType = "",
            signerId = false,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(),
            postponedId = 0
        ))
        service.add(Post(
            id = 2,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = Comments(),
            copyright = "",
            likes = Likes(),
            repost = Reposts(),
            views = Views(),
            postType = "",
            signerId = false,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(),
            postponedId = 0
        ))
        val update = Post(id = 3)

        val result = !service.update(update)

        assertTrue(result)
    }
}