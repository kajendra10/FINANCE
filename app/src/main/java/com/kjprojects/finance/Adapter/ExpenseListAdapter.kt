package com.kjprojects.finance.Adapter
import android.content.Context
import android.icu.text.DecimalFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kjprojects.finance.Domain.ExpenseDomain
import com.kjprojects.finance.databinding.ViewholderItemsBinding

class ExpenseListAdapter(private val items:MutableList<ExpenseDomain>):
    RecyclerView.Adapter<ExpenseListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ViewholderItemsBinding) : RecyclerView.ViewHolder(binding.root)

    private lateinit var context: Context
    var formatter: DecimalFormat? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExpenseListAdapter.ViewHolder {
        context = parent.context
        formatter = DecimalFormat("###,###,###.##")
        val binding = ViewholderItemsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExpenseListAdapter.ViewHolder, position: Int) {
        val item = items[position]

        holder.binding.titleTxt.text = item.title
        holder.binding.timeTxt.text = item.time
        holder.binding.priceTxt.text = "RM" + formatter?.format(item.price)
        val drawableResId = holder.itemView.context.resources.getIdentifier(
            item.pic,
            "drawable",
            context.packageName
        )
        Glide.with(context).load(drawableResId).into(holder.binding.pic)
    }

    override fun getItemCount(): Int = items.size
}
