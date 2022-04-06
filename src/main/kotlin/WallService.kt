package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 1

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

}

