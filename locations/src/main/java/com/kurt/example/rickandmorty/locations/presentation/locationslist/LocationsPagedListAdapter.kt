package com.kurt.example.rickandmorty.locations.presentation.locationslist

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kurt.example.rickandmorty.core.domain.entities.Location
import com.kurt.example.rickandmorty.core.presentation.BasePagedListAdapter
import com.kurt.example.rickandmorty.locations.R

/**
 * Copyright 2019, Kurt Renzo Acosta, All rights reserved.
 *
 * @author Kurt Renzo Acosta
 * @since 08/13/2019
 */
class LocationsPagedListAdapter : BasePagedListAdapter<Location>(
    itemsSame = { old, new -> old.id == new.id }
) {
    override val itemLayout: Int = R.layout.list_item_location

    override fun bindItemViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val location = getItem(position)

        if (location != null) {
            holder.itemView.apply {
                val txtName = findViewById<TextView>(R.id.txt_name)

                txtName.text = location.name
            }
        }
    }
}