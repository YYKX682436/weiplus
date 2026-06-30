package com.tencent.mm.wallet_core.ui.noscale;

/* loaded from: classes3.dex */
public class NoScaleLinearLayout extends android.widget.LinearLayout implements xn5.a0 {
    public NoScaleLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        sp5.c.b(this);
    }

    public NoScaleLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
