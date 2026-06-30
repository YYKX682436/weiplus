package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f138060d = 0;

    public g(com.tencent.mm.plugin.fts.ui.h hVar, com.tencent.mm.plugin.fts.ui.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f138060d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f138060d;
        this.f138060d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fts.ui.u3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
