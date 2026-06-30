package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class z3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148218d = 0;

    public z3(com.tencent.mm.plugin.magicbrush.a4 a4Var, com.tencent.mm.plugin.magicbrush.y3 y3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148218d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148218d;
        this.f148218d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.x7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
