package com.rodrigo.contentprovider

import android.database.Cursor

interface NoteClikedListener {
    fun noteClikedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}