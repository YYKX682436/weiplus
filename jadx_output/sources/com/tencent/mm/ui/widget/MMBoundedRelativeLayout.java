package com.tencent.mm.ui.widget;

/* loaded from: classes3.dex */
public class MMBoundedRelativeLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f211303d;

    /* renamed from: e, reason: collision with root package name */
    public int f211304e;

    public MMBoundedRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211303d = context.obtainStyledAttributes(attributeSet, wm0.a.f447185c).getDimensionPixelSize(1, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int i19 = this.f211303d;
        if (i19 > 0 && i19 < size) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(this.f211303d, android.view.View.MeasureSpec.getMode(i17));
        }
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int i27 = this.f211304e;
        if (i27 > 0 && i27 < size2) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(this.f211304e, android.view.View.MeasureSpec.getMode(i18));
        }
        super.onMeasure(i17, i18);
    }

    public void setMaxHeight(int i17) {
        this.f211304e = i17;
        requestLayout();
    }

    public void setMaxWidth(int i17) {
        this.f211303d = i17;
        requestLayout();
    }

    public MMBoundedRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211303d = context.obtainStyledAttributes(attributeSet, wm0.a.f447185c).getDimensionPixelSize(1, 0);
    }
}
