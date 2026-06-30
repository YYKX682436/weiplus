package com.tencent.mm.ui.widget;

/* loaded from: classes13.dex */
public class MMCenterChildGridView extends android.widget.GridView {
    public MMCenterChildGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        int size = android.view.View.MeasureSpec.getSize(i17);
        super.onMeasure(i17, makeMeasureSpec);
        int min = java.lang.Math.min(getNumColumns(), getAdapter().getCount());
        int columnWidth = (size - (min > 0 ? (((getColumnWidth() * min) + ((min - 1) * getHorizontalSpacing())) + getListPaddingLeft()) + getListPaddingRight() : 0)) / 2;
        setPadding(columnWidth, getPaddingTop(), columnWidth, getPaddingBottom());
        postInvalidate();
    }

    public MMCenterChildGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
