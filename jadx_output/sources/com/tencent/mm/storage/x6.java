package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class x6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196330d = 0;

    public x6(com.tencent.mm.storage.y6 y6Var, com.tencent.mm.storage.w6 w6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196330d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196330d;
        this.f196330d = i17 + 1;
        if (i17 == 0) {
            return k41.u0.INSTANCE;
        }
        if (i17 == 1) {
            return no3.k.INSTANCE;
        }
        if (i17 == 2) {
            return j00.c.INSTANCE;
        }
        if (i17 == 3) {
            return f01.u1.INSTANCE;
        }
        if (i17 == 4) {
            return y00.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
