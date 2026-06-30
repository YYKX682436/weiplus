package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class j1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148033d = 0;

    public j1(com.tencent.mm.plugin.magicbrush.k1 k1Var, com.tencent.mm.plugin.magicbrush.i1 i1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148033d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148033d;
        this.f148033d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.n5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
