package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes6.dex */
public class o0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f187456d = 0;

    public o0(com.tencent.mm.plugin.webview.ui.tools.widget.p0 p0Var, com.tencent.mm.plugin.webview.ui.tools.widget.n0 n0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f187456d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f187456d;
        this.f187456d = i17 + 1;
        if (i17 == 0) {
            return yg0.b3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
