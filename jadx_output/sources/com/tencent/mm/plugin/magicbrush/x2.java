package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class x2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148201d = 0;

    public x2(com.tencent.mm.plugin.magicbrush.y2 y2Var, com.tencent.mm.plugin.magicbrush.w2 w2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148201d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148201d;
        this.f148201d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.u6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
