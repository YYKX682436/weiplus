package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148212d = 0;

    public z(com.tencent.mm.plugin.magicbrush.a0 a0Var, com.tencent.mm.plugin.magicbrush.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148212d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148212d;
        this.f148212d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.u6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
