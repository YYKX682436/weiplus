package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class v3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148180d = 0;

    public v3(com.tencent.mm.plugin.magicbrush.w3 w3Var, com.tencent.mm.plugin.magicbrush.u3 u3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148180d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148180d;
        this.f148180d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.t7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
