package com.tencent.mm.ui.base;

/* loaded from: classes4.dex */
public class MMAlbumListView extends android.widget.ListView {
    public MMAlbumListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public MMAlbumListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
