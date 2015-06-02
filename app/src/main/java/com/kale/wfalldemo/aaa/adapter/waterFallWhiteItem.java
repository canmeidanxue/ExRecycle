package com.kale.wfalldemo.aaa.adapter;

import com.facebook.drawee.view.SimpleDraweeView;
import com.kale.wfalldemo.R;
import com.kale.wfalldemo.aaa.mode.PhotoData;
import com.kale.wfalldemo.extra.fresco.DynamicHeightSimpleDraweeView;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;

import kale.adapter.recycler.RcvAdapterItem;


public class waterFallWhiteItem extends RcvAdapterItem<PhotoData> {

    public DynamicHeightSimpleDraweeView contentSdv;

    public TextView descriptionTv;

    public SimpleDraweeView headPicSdv;

    public TextView positionTv;

    public waterFallWhiteItem(Context context, int layoutResId) {
        super(context, layoutResId);
        contentSdv = getView(R.id.aaa_wf_item_content_DraweeView);
        descriptionTv = getView(R.id.aaa_wf_item_description_textView);
        headPicSdv = getView(R.id.aaa_wf_item_user_head_draweeView);
        positionTv = getView(R.id.aaa_wf_item_positon_textView);
    }

    @Override
    public void setViews(PhotoData data, int position) {
        contentSdv.setImageURI(Uri.parse(data.photo.path));

        float picRatio = (float) data.photo.height / data.photo.width;
        contentSdv.setHeightRatio(picRatio);

        descriptionTv.setText(data.msg);
        headPicSdv.setImageURI(Uri.parse("http://wenwen.soso.com/p/20100203/20100203005516-1158326774.jpg"));

        positionTv.setText("No." + position);
    }
}

