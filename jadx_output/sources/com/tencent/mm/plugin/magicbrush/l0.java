package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148063d = 0;

    public l0(com.tencent.mm.plugin.magicbrush.m0 m0Var, com.tencent.mm.plugin.magicbrush.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148063d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148063d;
        this.f148063d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.c6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
