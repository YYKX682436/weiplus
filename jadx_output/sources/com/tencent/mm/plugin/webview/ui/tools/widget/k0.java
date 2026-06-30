package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes6.dex */
public class k0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f187359d = 0;

    public k0(com.tencent.mm.plugin.webview.ui.tools.widget.l0 l0Var, com.tencent.mm.plugin.webview.ui.tools.widget.j0 j0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f187359d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f187359d;
        this.f187359d = i17 + 1;
        if (i17 == 0) {
            return yg0.y2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
