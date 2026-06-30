package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f143899d = 0;

    public b(com.tencent.mm.plugin.lite.logic.c cVar, com.tencent.mm.plugin.lite.logic.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f143899d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f143899d;
        this.f143899d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.lite.logic.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
