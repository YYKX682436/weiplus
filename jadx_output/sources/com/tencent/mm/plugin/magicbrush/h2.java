package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class h2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148018d = 0;

    public h2(com.tencent.mm.plugin.magicbrush.i2 i2Var, com.tencent.mm.plugin.magicbrush.g2 g2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148018d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148018d;
        this.f148018d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.g6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
