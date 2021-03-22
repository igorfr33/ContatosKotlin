package com.example.contatosbootcamp

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ContactAdapter (val contactsList: ArrayList<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItem(contact: Contact){

            val textName = itemView.findViewById<TextView>(R.id.contact_name)
            val textPhone = itemView.findViewById<TextView>(R.id.contact_phone)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber

        }

    }

}