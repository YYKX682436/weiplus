package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148198d = 0;

    public x0(com.tencent.mm.plugin.magicbrush.y0 y0Var, com.tencent.mm.plugin.magicbrush.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148198d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148198d;
        this.f148198d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.t7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
