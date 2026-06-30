package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f183045d = 0;

    public o(com.tencent.mm.plugin.webview.model.p pVar, com.tencent.mm.plugin.webview.model.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f183045d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f183045d;
        this.f183045d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.webview.model.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
