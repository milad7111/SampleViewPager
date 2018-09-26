package com.example.sampleviewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.PagerAdapter
import java.util.*

class FragmentViewPagerAdapter(fragmentManager: FragmentManager) : SmartFragmentStatePagerAdapter(fragmentManager) {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val item = LayoutInflater.from(container.context).inflate(if (position == count - 1) R.layout.al else R.layout.li, container, false)

        container.addView(item)
        return item

        //        CardView cardView = item.findViewById(R.id.card_view);
        //        cardView.setCardBackgroundColor(ContextCompat.getColor(container.getContext(), (items.get(getRelativePosition(position)).color)));
        //        return super.instantiateItem(container, getRelativePosition(position));
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
        //        super.destroyItem(container, getRelativePosition(position), object);
    }

    private class Item(private val color: Int)

    companion object {

        private val items = Arrays.asList(
                Item(R.color.md_indigo_500),
                Item(R.color.md_green_500),
                Item(R.color.md_red_500),
                Item(R.color.md_orange_500),
                Item(R.color.md_purple_500))
    }
}
