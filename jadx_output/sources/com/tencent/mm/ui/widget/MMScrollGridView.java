package com.tencent.mm.ui.widget;

/* loaded from: classes13.dex */
public class MMScrollGridView extends android.widget.GridView {
    public MMScrollGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public MMScrollGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
