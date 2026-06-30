package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class p2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148095d = 0;

    public p2(com.tencent.mm.plugin.magicbrush.q2 q2Var, com.tencent.mm.plugin.magicbrush.o2 o2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148095d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148095d;
        this.f148095d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.m6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
