package com.tencent.mm.plugin.normsg;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152415d = 0;

    public b(com.tencent.mm.plugin.normsg.c cVar, com.tencent.mm.plugin.normsg.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152415d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152415d;
        this.f152415d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.normsg.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
