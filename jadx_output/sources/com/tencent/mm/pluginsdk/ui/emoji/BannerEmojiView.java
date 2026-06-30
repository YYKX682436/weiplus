package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes3.dex */
public class BannerEmojiView extends com.tencent.mm.plugin.gif.MMAnimateView {
    public BannerEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int right = ((getRight() - getLeft()) - getPaddingRight()) - getPaddingLeft();
        int i19 = right / 2;
        if (right == 0 || i19 == 0) {
            right = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        android.graphics.drawable.Drawable drawable = getDrawable();
        setMeasuredDimension(right, (int) (right * ((drawable == null || drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) ? 0.53333336f : (drawable.getIntrinsicHeight() * 1.0f) / drawable.getIntrinsicWidth())));
    }

    public BannerEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
