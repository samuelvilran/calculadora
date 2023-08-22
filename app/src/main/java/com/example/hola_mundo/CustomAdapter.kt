package com.example.hola_mundo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class CustomAdapter(private val operationSet: MutableList<Operation>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView
        var respView : TextView
        var cant1View : TextView
        var cant2View : TextView

        init {
            // Define click listener for the ViewHolder's View.
            cant1View = view.findViewById(R.id.num1View)
            cant2View = view.findViewById(R.id.num2View)
            respView = view.findViewById(R.id.respView)
            textView = view.findViewById(R.id.operator)


        }
    }

    override fun getItemCount() = operationSet.size


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
        viewHolder.textView.text =  operationSet[position].operator.toString()
        viewHolder.textView.text =  operationSet[position].resp.toString()
        viewHolder.cant2View.text = operationSet[position].cant2.toString()
        viewHolder.cant1View.text = operationSet[position].cant1.toString()

                }



}



