package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes.dex */
public class FavourLayout extends android.widget.LinearLayout {
    public FavourLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWording(java.util.LinkedList<java.lang.String> linkedList) {
        removeAllViews();
        java.util.Iterator<java.lang.String> it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setText(next);
            textView.setTextColor(android.graphics.Color.parseColor("#ff891e"));
            textView.setTextSize(0, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479925j4));
            addView(textView);
        }
    }

    public FavourLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
