package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f187228d = 0;

    public g0(com.tencent.mm.plugin.webview.ui.tools.widget.h0 h0Var, com.tencent.mm.plugin.webview.ui.tools.widget.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f187228d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f187228d;
        this.f187228d = i17 + 1;
        if (i17 == 0) {
            return yg0.y2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
