package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class p6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f195226d = 0;

    public p6(com.tencent.mm.storage.q6 q6Var, com.tencent.mm.storage.o6 o6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f195226d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f195226d;
        this.f195226d = i17 + 1;
        if (i17 == 0) {
            return p62.g.INSTANCE;
        }
        if (i17 == 1) {
            return on.c.INSTANCE;
        }
        if (i17 == 2) {
            return j50.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
