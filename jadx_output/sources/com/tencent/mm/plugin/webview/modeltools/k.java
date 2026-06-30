package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f183303d = 0;

    public k(com.tencent.mm.plugin.webview.modeltools.l lVar, com.tencent.mm.plugin.webview.modeltools.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f183303d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f183303d;
        this.f183303d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.webview.modeltools.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
