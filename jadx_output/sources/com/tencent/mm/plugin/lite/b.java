package com.tencent.mm.plugin.lite;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f143448d = 0;

    public b(com.tencent.mm.plugin.lite.c cVar, com.tencent.mm.plugin.lite.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f143448d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f143448d;
        this.f143448d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.lite.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
