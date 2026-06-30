package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class j7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f195056d = 0;

    public j7(com.tencent.mm.storage.k7 k7Var, com.tencent.mm.storage.i7 i7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f195056d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f195056d;
        this.f195056d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.storage.xa.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
