package com.tencent.mm.view;

/* loaded from: classes11.dex */
public class MaxHeightScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public int f213347d;

    public MaxHeightScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        hashCode();
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447205w, 0, 0);
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == 0) {
                    setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getMaxHeight() {
        return this.f213347d;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f213347d > 0) {
            int measuredHeight = getMeasuredHeight();
            int i19 = this.f213347d;
            if (measuredHeight > i19) {
                setMeasuredDimension(i17, android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE));
            }
        }
    }

    public void setMaxHeight(int i17) {
        this.f213347d = i17;
        requestLayout();
    }

    public MaxHeightScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        hashCode();
        a(context, attributeSet);
    }
}
