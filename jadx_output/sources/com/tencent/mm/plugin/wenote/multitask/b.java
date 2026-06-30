package com.tencent.mm.plugin.wenote.multitask;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188129d = 0;

    public b(com.tencent.mm.plugin.wenote.multitask.c cVar, com.tencent.mm.plugin.wenote.multitask.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188129d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188129d;
        this.f188129d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.wenote.multitask.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
