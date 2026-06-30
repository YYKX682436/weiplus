package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f182237d = 0;

    public j(com.tencent.mm.plugin.webview.luggage.k kVar, com.tencent.mm.plugin.webview.luggage.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f182237d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f182237d;
        this.f182237d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.webview.luggage.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
