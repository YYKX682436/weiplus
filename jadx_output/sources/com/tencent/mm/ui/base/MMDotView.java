package com.tencent.mm.ui.base;

/* loaded from: classes8.dex */
public class MMDotView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f197330d;

    /* renamed from: e, reason: collision with root package name */
    public int f197331e;

    /* renamed from: f, reason: collision with root package name */
    public int f197332f;

    public MMDotView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197330d = 9;
        this.f197331e = com.tencent.mm.R.drawable.ats;
        this.f197332f = com.tencent.mm.R.drawable.atq;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447197o);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        setDotCount(resourceId);
    }

    public void setDarkStyle(boolean z17) {
        if (z17) {
            this.f197331e = com.tencent.mm.R.drawable.att;
            this.f197332f = com.tencent.mm.R.drawable.atr;
        } else {
            this.f197331e = com.tencent.mm.R.drawable.ats;
            this.f197332f = com.tencent.mm.R.drawable.atq;
        }
    }

    public void setDotCount(int i17) {
        if (i17 < 0) {
            return;
        }
        if (i17 > this.f197330d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDotView", "large than max count");
            i17 = this.f197330d;
        }
        removeAllViews();
        while (i17 != 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c1t, null);
            imageView.setImageResource(this.f197331e);
            addView(imageView);
            i17--;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) getChildAt(0);
        if (imageView2 != null) {
            imageView2.setImageResource(this.f197332f);
        }
    }

    public void setInvertedStyle(boolean z17) {
        if (z17) {
            this.f197331e = com.tencent.mm.R.drawable.atq;
            this.f197332f = com.tencent.mm.R.drawable.ats;
        } else {
            this.f197331e = com.tencent.mm.R.drawable.ats;
            this.f197332f = com.tencent.mm.R.drawable.atq;
        }
    }

    public void setMaxCount(int i17) {
        this.f197330d = i17;
    }

    public void setSelectedDot(int i17) {
        if (i17 >= getChildCount()) {
            i17 = getChildCount() - 1;
        } else if (i17 < 0) {
            i17 = 0;
        }
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            ((android.widget.ImageView) getChildAt(i18)).setImageResource(this.f197331e);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) getChildAt(i17);
        if (imageView != null) {
            imageView.setImageResource(this.f197332f);
        }
    }

    public MMDotView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197330d = 9;
        this.f197331e = com.tencent.mm.R.drawable.ats;
        this.f197332f = com.tencent.mm.R.drawable.atq;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447197o);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        setDotCount(resourceId);
    }
}
