package com.tencent.mm.ui.applet;

/* loaded from: classes15.dex */
public class StrokeScrollBar extends com.tencent.mm.ui.base.VerticalScrollBar {
    public StrokeScrollBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public void c() {
        this.f197706f = new java.lang.String[18];
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f197706f;
            if (i17 >= strArr.length) {
                this.f197704d = 2.0f;
                this.f197705e = 79;
                return;
            } else {
                strArr[i17] = java.lang.Integer.toString(i17 + 3) + "劃";
                i17++;
            }
        }
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public int getToastLayoutId() {
        return com.tencent.mm.R.layout.cnb;
    }
}
