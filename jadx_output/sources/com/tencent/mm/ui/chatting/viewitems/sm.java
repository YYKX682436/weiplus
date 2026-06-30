package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public class sm {
    public sm(com.tencent.mm.ui.chatting.viewitems.xg xgVar) {
        android.content.Context context = xgVar.getContext();
        android.widget.TextView textView = new android.widget.TextView(context, null, com.tencent.mm.R.style.f494120er);
        textView.setBackgroundResource(com.tencent.mm.R.drawable.f481229nv);
        textView.setId(com.tencent.mm.R.id.bqw);
        textView.setVisibility(8);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479930ja);
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479930ja);
        if (h17 != dimensionPixelSize) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemStackMsgContainerHandler", "warn!!! cacheSize:%s sysSize:%s", java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(dimensionPixelSize));
        }
        textView.setTextSize(0, dimensionPixelSize);
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479567j), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479567j), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, i65.a.h(context, com.tencent.mm.R.dimen.f479693cs));
        layoutParams.addRule(4, com.tencent.mm.R.id.f483696br1);
        layoutParams.addRule(19, com.tencent.mm.R.id.f483696br1);
        layoutParams.addRule(21, -1);
        layoutParams.setMargins(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf), 0);
        xgVar.addView(textView, layoutParams);
    }
}
