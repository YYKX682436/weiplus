package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class t2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148148d = 0;

    public t2(com.tencent.mm.plugin.magicbrush.u2 u2Var, com.tencent.mm.plugin.magicbrush.s2 s2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148148d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148148d;
        this.f148148d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.p6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
