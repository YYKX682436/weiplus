package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148092d = 0;

    public p0(com.tencent.mm.plugin.magicbrush.q0 q0Var, com.tencent.mm.plugin.magicbrush.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148092d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148092d;
        this.f148092d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.z5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
