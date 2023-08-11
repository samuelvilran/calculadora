package com.example.hola_mundo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




    /*clase para el viewholder
inner class ViewHolder(dataView: View, itemView: View) : RecyclerView.ViewHolder(itemView) {


    var resView: TextView = dataView.findViewById(R.id.txtRes)
    var num1View: TextView = dataView.findViewById(R.id.num1)
    var num2View: TextView = dataView.findViewById(R.id.num2)
}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //Crear la view y enviarla
                 var view = LayoutInflater.from(parent.context).inflate(R.layout.adapter,parent,false)
            return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mlist.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



        var dataModel = mlist[position]

        //holder.textView.text = dataModel.text
    }
}
*/





class CustomAdapter(private val dataSet: MutableList<MathOperation>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.num1View)

        }
    }

    override fun getItemCount() = dataSet.size


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.view_holder, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text =  dataSet[position].operationType
    }



}



