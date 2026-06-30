package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes.dex */
public class r1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148108d = 0;

    public r1(com.tencent.mm.plugin.magicbrush.s1 s1Var, com.tencent.mm.plugin.magicbrush.q1 q1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148108d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148108d;
        this.f148108d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.x5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
