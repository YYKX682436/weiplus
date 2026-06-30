package com.tencent.mm.plugin.game.media;

/* loaded from: classes4.dex */
public class FixAspectRatioRelativeLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f140042d;

    public FixAspectRatioRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hj0.a.f281575a, 0, 0);
        this.f140042d = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int i19 = (int) (this.f140042d * size);
        com.tencent.mars.xlog.Log.i("MicroMsg.FixAspectRatioRelativeLayout", "width = %d, height = %d, ratioHeight = %d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i19));
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
    }

    public FixAspectRatioRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hj0.a.f281575a, i17, 0);
        this.f140042d = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
