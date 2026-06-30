package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class IPCallPayButtonLayout extends android.widget.RelativeLayout {
    public IPCallPayButtonLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec((int) (getMeasuredWidth() * 0.62d), 1073741824));
    }

    public IPCallPayButtonLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
