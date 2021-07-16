package com.example.displaycontactimages

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactImageRvAdapter(var contactImageList:List<ContactImage>, var context:Context):RecyclerView.Adapter<ContactImageViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactImageViewHolder {
        var identity=LayoutInflater.from(parent.context).inflate(R.layout.contact_image_list_items,parent,false)
        return  ContactImageViewHolder(identity)
    }

    override fun onBindViewHolder(holder: ContactImageViewHolder, position: Int) {
        var currentContact=contactImageList.get(position)
        holder.etName.text=currentContact.name
        holder.etEmail.text=currentContact.email
        holder.etPhone.text=currentContact.phone
//       holder.imgUrl.text=currentContact.imageUrl
        Picasso.get().load(currentContact.imageUrl).resize(100,100).placeholder(R.drawable.holder).into(holder.imgUrl)
        holder.cvContacts.setOnClickListener{
            var intent=Intent(context,DisplayRvContact::class.java)
            intent.putExtra("Name",currentContact.name)
            intent.putExtra("Email",currentContact.email)
            intent.putExtra("Phone",currentContact.phone)
            intent.putExtra("ImageUrl",currentContact.imageUrl)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactImageList.size
    }
}
class ContactImageViewHolder(contactView:View):RecyclerView.ViewHolder(contactView){
    var etName=contactView.findViewById<TextView>(R.id.etEmail)
    var etEmail=contactView.findViewById<TextView>(R.id.etEmail)
    var etPhone=contactView.findViewById<TextView>(R.id.etEmail)
    var imgUrl=contactView.findViewById<ImageView>(R.id.ImgUrl)
    var cvContacts=contactView.findViewById<CardView>(R.id.cvContacts)


}