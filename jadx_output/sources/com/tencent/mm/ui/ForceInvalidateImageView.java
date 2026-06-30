package com.tencent.mm.ui;

/* loaded from: classes4.dex */
public class ForceInvalidateImageView extends android.widget.ImageView {
    public ForceInvalidateImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        if (i17 == 0) {
            invalidate();
        }
        super.onVisibilityChanged(view, i17);
    }

    public ForceInvalidateImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
