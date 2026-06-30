package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class SquareImageView extends android.widget.ImageView {
    public SquareImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int defaultSize = android.view.View.getDefaultSize(getSuggestedMinimumWidth(), i17);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i17, i19, i27);
    }

    public SquareImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
