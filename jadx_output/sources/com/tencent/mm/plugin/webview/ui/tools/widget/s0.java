package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes6.dex */
public class s0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f187529d = 0;

    public s0(com.tencent.mm.plugin.webview.ui.tools.widget.t0 t0Var, com.tencent.mm.plugin.webview.ui.tools.widget.r0 r0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f187529d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f187529d;
        this.f187529d = i17 + 1;
        if (i17 == 0) {
            return yg0.e3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
