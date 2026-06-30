package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class t6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f195327d = 0;

    public t6(com.tencent.mm.storage.u6 u6Var, com.tencent.mm.storage.s6 s6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f195327d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f195327d;
        this.f195327d = i17 + 1;
        if (i17 == 0) {
            return bt.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
