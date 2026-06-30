package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class v1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148177d = 0;

    public v1(com.tencent.mm.plugin.magicbrush.w1 w1Var, com.tencent.mm.plugin.magicbrush.u1 u1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148177d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148177d;
        this.f148177d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.z5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
