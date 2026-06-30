package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class n3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148083d = 0;

    public n3(com.tencent.mm.plugin.magicbrush.o3 o3Var, com.tencent.mm.plugin.magicbrush.m3 m3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148083d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148083d;
        this.f148083d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.i7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
