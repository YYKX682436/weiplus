package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f137456d = 0;

    public b(com.tencent.mm.plugin.fts.logic.c cVar, com.tencent.mm.plugin.fts.logic.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f137456d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f137456d;
        this.f137456d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fts.logic.t3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
