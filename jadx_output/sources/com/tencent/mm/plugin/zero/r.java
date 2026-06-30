package com.tencent.mm.plugin.zero;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188676d = 0;

    public r(com.tencent.mm.plugin.zero.s sVar, com.tencent.mm.plugin.zero.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188676d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188676d;
        this.f188676d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.booter.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
