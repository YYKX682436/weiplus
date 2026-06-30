package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class f7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f193925d = 0;

    public f7(com.tencent.mm.storage.g7 g7Var, com.tencent.mm.storage.e7 e7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f193925d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f193925d;
        this.f193925d = i17 + 1;
        if (i17 == 0) {
            return sv.f.INSTANCE;
        }
        if (i17 == 1) {
            return gj1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
