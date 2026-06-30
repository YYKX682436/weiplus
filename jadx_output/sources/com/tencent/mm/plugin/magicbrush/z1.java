package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class z1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148215d = 0;

    public z1(com.tencent.mm.plugin.magicbrush.a2 a2Var, com.tencent.mm.plugin.magicbrush.y1 y1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148215d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148215d;
        this.f148215d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.c6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
