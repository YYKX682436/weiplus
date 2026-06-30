package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class v5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196284d = 0;

    public v5(com.tencent.mm.storage.w5 w5Var, com.tencent.mm.storage.u5 u5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196284d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196284d;
        this.f196284d = i17 + 1;
        if (i17 == 0) {
            return xw.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
