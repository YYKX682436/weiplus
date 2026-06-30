package com.tencent.mm.plugin.newtips;

/* loaded from: classes8.dex */
public class CustomSizeIconNewTipPreference extends com.tencent.mm.plugin.newtips.NormalIconNewTipPreference {
    public CustomSizeIconNewTipPreference(android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference
    public void l0(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        android.content.Context context = this.Y1;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479887i0);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479924j3);
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomSizeIconNewTipPreference", "radioWH:%f, maxRadio:%f", java.lang.Float.valueOf(width), java.lang.Float.valueOf(1.7777778f));
        if (width == 1.0d) {
            Z(dimensionPixelOffset, dimensionPixelOffset);
            int i17 = dimensionPixelOffset + dimensionPixelOffset2;
            W(i17, i17);
        } else if (width < 1.7777778f) {
            int i18 = (int) (dimensionPixelOffset * width);
            Z(i18, dimensionPixelOffset);
            W(i18 + dimensionPixelOffset2, dimensionPixelOffset + dimensionPixelOffset2);
        } else {
            int i19 = (int) (dimensionPixelOffset * 1.7777778f);
            int i27 = (int) (i19 / width);
            Z(i19, i27);
            W(i19 + dimensionPixelOffset2, i27 + dimensionPixelOffset2);
        }
    }

    public CustomSizeIconNewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomSizeIconNewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
