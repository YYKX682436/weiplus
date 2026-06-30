package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148105d = 0;

    public r(com.tencent.mm.plugin.magicbrush.s sVar, com.tencent.mm.plugin.magicbrush.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148105d;
        this.f148105d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.m6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
