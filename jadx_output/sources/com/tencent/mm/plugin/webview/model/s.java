package com.tencent.mm.plugin.webview.model;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f183094d = 0;

    public s(com.tencent.mm.plugin.webview.model.t tVar, com.tencent.mm.plugin.webview.model.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f183094d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f183094d;
        this.f183094d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.webview.luggage.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
