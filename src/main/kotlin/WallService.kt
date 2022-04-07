import ru.netology.Post

class WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 1
    private var comments = emptyArray<Comment>()


    fun add(post: Post): Post {
        posts += post.copy(id = lastId)
        lastId++
        posts += post
        return post
    }

    fun update(post: Post): Boolean {

        for (searchPost in posts.indices)
            if (posts[searchPost].id == post.id) {
                posts[searchPost] = post.copy(id = posts[searchPost].id, date = posts[searchPost].date)
                return true
            }
        return false
    }
    fun createComment(comment: Comment): Boolean {
        for (i in posts.indices) {
            if (posts[i].id == comment.postId) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException()
    }
}


