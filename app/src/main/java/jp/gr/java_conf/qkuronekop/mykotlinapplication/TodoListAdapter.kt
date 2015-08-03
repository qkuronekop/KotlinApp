package jp.gr.java_conf.qkuronekop.mykotlinapplication

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by satomitanaka on 15/08/03.
 */

class TodoListAdapter(context: Context, todos: List<Todo>) : ArrayAdapter<Todo>(context, 0, todos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        throw UnsupportedOperationException()
        return convertView
    }

    override fun getItem(position: Int): Todo {
        throw UnsupportedOperationException()
        return getItem(position)
    }

    override fun getItemId(position: Int): Long {
        throw UnsupportedOperationException()
        return 0L
    }

    class ViewHolder(val todoName: TextView){
    }
}