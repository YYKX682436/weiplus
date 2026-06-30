package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class IPCallShareSquareLayout extends android.widget.RelativeLayout {
    public IPCallShareSquareLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824));
    }

    public IPCallShareSquareLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
