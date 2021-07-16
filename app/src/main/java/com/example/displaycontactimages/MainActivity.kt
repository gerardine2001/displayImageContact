package com.example.displaycontactimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun DisplayContactImage(){
        var contactImageList= listOf<ContactImage>(
            ContactImage("Belyse","intwazabelyse@gmail.com","0780000","https://image.shutterstock.com/mosaic_250/2797510/1617540484/stock-photo-closeup-photo-of-amazing-short-hairdo-lady-looking-up-empty-space-deep-thinking-creative-person-arm-1617540484.jpg"),
            ContactImage("Chantal","mariechantal@gmail.com","078993766","https://image.shutterstock.com/image-photo/close-photo-beautiful-amazing-she-260nw-1403464760.jpg"),
            ContactImage("Celine","celinegushima@gmail.com","03899987","https://image.shutterstock.com/image-photo/close-photo-beautiful-amazing-she-260nw-1403464760.jpg"),
            ContactImage("Marie","mariegithinji@gmail.com","7833990","https://previews.123rf.com/images/zurijeta/zurijeta1403/zurijeta140300420/26355437-young-beautiful-muslim-girl-portrait.jpg"),
            ContactImage("Doro","wangraakothdorothy@gmail.com","04667735","https://im"),
            ContactImage("Daisi","daissiodawa@gmail.com","057888",""),
            ContactImage("Pamela","pamela@gmail.com","0783544",""),
            ContactImage("Janine","janine@gmail.com","03577665",""),
            ContactImage("Gerardine","gerardine@gmal.com","053675",""),
            ContactImage("Rahma","rahma@gnail.com","08465765","")

        )
        rvContact=findViewById<RecyclerView>(R.id.rvContactImage)
        var contactImageAdapter=ContactImageRvAdapter(contactImageList,baseContext)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactImageAdapter

    }
}