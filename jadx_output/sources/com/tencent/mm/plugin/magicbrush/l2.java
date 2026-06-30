package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class l2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148066d = 0;

    public l2(com.tencent.mm.plugin.magicbrush.m2 m2Var, com.tencent.mm.plugin.magicbrush.k2 k2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148066d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148066d;
        this.f148066d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.j6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
