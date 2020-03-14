//
//import android.graphics.ColorSpace
//import io.reactivex.Observable
//import kotlinx.coroutines.Deferred
//import okhttp3.Call
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
//import retrofit2.converter.gson.GsonConverterFactory
//import retrofit2.http.GET
//import retrofit2.http.Query
//
//
//interface APIInterface {
//
//        @GET("/posts")
//        fun getPosts() : Deferred<Response<List<PlaceholderPosts>>>
//
//        @GET("/users")
//        fun getUsers() : Deferred<Response<List<PlaceholderUsers>>>
//
//        @GET("/photos")
//        fun getPhotos() : Deferred<Response<List<PlaceholderPhotos>>>
//
//
//}