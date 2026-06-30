package com.tencent.mm.plugin.lite.api;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f143421d = 0;

    public b(com.tencent.mm.plugin.lite.api.c cVar, com.tencent.mm.plugin.lite.api.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f143421d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f143421d;
        this.f143421d = i17 + 1;
        if (i17 == 0) {
            return yb1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
