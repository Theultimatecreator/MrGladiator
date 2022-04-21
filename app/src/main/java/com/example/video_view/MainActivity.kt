package com.example.video_view
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity :  AppCompatActivity() {
    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleVideoView = findViewById<View>(R.id.video_view) as VideoView

        var product: List

        product = intent.getSerializableExtra("product") as List

        val name = findViewById<TextView>(R.id.text)
        val image = findViewById<ImageView>(R.id.image_View2)
        val price = findViewById<TextView>(R.id.text12)

        name.setText(product.title)
        image.setImageResource(product.imageView)
        price.setText(product.discraption)


        if (mediaControls == null) {
            mediaControls = MediaController(this)
            mediaControls!!.setAnchorView(this.simpleVideoView)
        }
        simpleVideoView!!.setMediaController(mediaControls)

        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.video_view))

        simpleVideoView!!.start()



    }
}