package com.tencent.mm.ui.base;

/* loaded from: classes3.dex */
public class MMAutoHeightViewPager extends androidx.viewpager.widget.ViewPager {
    private static final java.lang.String TAG = "MicoMsg.MMAutoHeightViewPager";

    public MMAutoHeightViewPager(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = 0;
        for (int i27 = 0; i27 < getChildCount(); i27++) {
            android.view.View childAt = getChildAt(i27);
            childAt.measure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i19) {
                i19 = measuredHeight;
            }
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
    }

    public MMAutoHeightViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMAutoHeightViewPager(android.content.Context context) {
        super(context);
    }
}
