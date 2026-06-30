package com.tencent.mm.ui.transmit.recent;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f211049d = 0;

    public b(com.tencent.mm.ui.transmit.recent.c cVar, com.tencent.mm.ui.transmit.recent.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f211049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f211049d;
        this.f211049d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.transmit.recent.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
