package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class h6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f195007d = 0;

    public h6(com.tencent.mm.storage.i6 i6Var, com.tencent.mm.storage.g6 g6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f195007d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f195007d;
        this.f195007d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.storage.i5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
