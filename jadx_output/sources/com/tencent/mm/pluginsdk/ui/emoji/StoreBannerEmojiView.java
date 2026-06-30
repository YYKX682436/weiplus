package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes3.dex */
public class StoreBannerEmojiView extends com.tencent.mm.plugin.gif.MMAnimateView {
    public StoreBannerEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        android.content.Context context = getContext();
        int[] iArr = new int[2];
        if (context instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        } else {
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            iArr[0] = defaultDisplay.getWidth();
            iArr[1] = defaultDisplay.getHeight();
        }
        int i19 = iArr[0];
        int i27 = ((i19 * 3) / 8) + 1;
        if (i19 <= 0 || i27 <= 0) {
            super.onMeasure(i17, i18);
        } else {
            setMeasuredDimension(i19, i27);
        }
    }

    public StoreBannerEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
