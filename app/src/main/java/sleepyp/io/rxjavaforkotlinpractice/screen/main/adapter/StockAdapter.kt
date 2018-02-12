package sleepyp.io.rxjavaforkotlinpractice.screen.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.stock_item.view.*
import sleepyp.io.rxjavaforkotlinpractice.R

class StockAdapter : RecyclerView.Adapter<StockAdapter.StockViewHolder>() {

    private val list = arrayListOf<String>()

    override fun onBindViewHolder(holder: StockViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StockViewHolder =
            StockViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.stock_item, parent, false))

    override fun getItemCount(): Int {
        return list.size
    }

    fun addItem(text: String) {
        list.add(text)
    }

    class StockViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(data: String) {
            itemView.stock_item_symbol.text = data
        }
    }
}

