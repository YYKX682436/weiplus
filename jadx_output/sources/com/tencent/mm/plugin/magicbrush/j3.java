package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class j3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148036d = 0;

    public j3(com.tencent.mm.plugin.magicbrush.k3 k3Var, com.tencent.mm.plugin.magicbrush.i3 i3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148036d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148036d;
        this.f148036d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.e7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
