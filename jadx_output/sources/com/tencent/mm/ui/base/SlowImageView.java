package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class SlowImageView extends android.widget.ImageView {
    public SlowImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setImageLoader(db5.a9 a9Var) {
        a9Var.a(this);
    }

    public SlowImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
