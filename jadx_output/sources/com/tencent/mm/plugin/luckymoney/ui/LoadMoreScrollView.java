package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes12.dex */
public class LoadMoreScrollView extends android.widget.ScrollView {
    public LoadMoreScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i17, int i18, boolean z17, boolean z18) {
        getScrollY();
        super.onOverScrolled(i17, i18, z17, z18);
    }

    public void setOnLoadMoreListener(com.tencent.mm.plugin.luckymoney.ui.d dVar) {
    }

    public LoadMoreScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
