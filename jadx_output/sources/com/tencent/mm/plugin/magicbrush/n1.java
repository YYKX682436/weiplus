package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class n1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148080d = 0;

    public n1(com.tencent.mm.plugin.magicbrush.o1 o1Var, com.tencent.mm.plugin.magicbrush.m1 m1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148080d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148080d;
        this.f148080d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.u5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
