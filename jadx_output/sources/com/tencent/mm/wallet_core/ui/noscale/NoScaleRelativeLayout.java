package com.tencent.mm.wallet_core.ui.noscale;

/* loaded from: classes3.dex */
public class NoScaleRelativeLayout extends android.widget.RelativeLayout implements xn5.a0 {
    public NoScaleRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        sp5.c.b(this);
    }

    public NoScaleRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
