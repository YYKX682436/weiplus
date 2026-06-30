package com.tencent.mm.ui.base;

/* loaded from: classes4.dex */
public class AuthorizeItemListView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public int f197232d;

    public AuthorizeItemListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f197232d <= 5) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i17, i18);
        }
    }

    public AuthorizeItemListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
