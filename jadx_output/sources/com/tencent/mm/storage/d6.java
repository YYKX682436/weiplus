package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class d6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f193838d = 0;

    public d6(com.tencent.mm.storage.e6 e6Var, com.tencent.mm.storage.c6 c6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f193838d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f193838d;
        this.f193838d = i17 + 1;
        if (i17 == 0) {
            return tx.c.INSTANCE;
        }
        if (i17 == 1) {
            return wr4.l.INSTANCE;
        }
        if (i17 == 2) {
            return h14.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
