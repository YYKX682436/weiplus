package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes5.dex */
public class IPCallShareViewPager extends com.tencent.mm.ui.base.CustomViewPager {
    public IPCallShareViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.View
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
}
