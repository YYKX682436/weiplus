package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f184188d = 0;

    public b(com.tencent.mm.plugin.webview.ui.tools.floatball.c cVar, com.tencent.mm.plugin.webview.ui.tools.floatball.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f184188d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f184188d;
        this.f184188d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.webview.ui.tools.floatball.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
