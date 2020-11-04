package com.gardify.groupielibrarysample;

import androidx.annotation.NonNull;

import com.gardify.groupielibrarysample.databinding.RecyclerViewItemBinding;
import com.xwray.groupie.databinding.BindableItem;

public class MyAdapter extends BindableItem<RecyclerViewItemBinding> {

    Friends mFriends;

    MyAdapter(Friends friends){
        mFriends = friends;
    }

    @Override
    public void bind(@NonNull RecyclerViewItemBinding viewBinding, int position) {

        viewBinding.name.setText(mFriends.getName());
        viewBinding.email.setText(mFriends.getName());
        viewBinding.imageView.setImageResource(mFriends.getImage());
    }

    @Override
    public int getLayout() {
        return R.layout.recycler_view_item;
    }
}
