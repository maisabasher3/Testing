import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller;

@Controller
class PostResolver {
    @QueryMapping
    fun getPost():List<PostDto>{
        return listOf(
            PostDto(
                id = 1,
                tittle = "Tittle",
                description = "Description"
            )
        )
    }


}

data class PostDto(val id: Int, val tittle: String, val description: String)