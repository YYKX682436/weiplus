package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f183158d = 0;

    public w(com.tencent.mm.plugin.webview.model.x xVar, com.tencent.mm.plugin.webview.model.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f183158d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f183158d;
        this.f183158d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.webview.model.w4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
