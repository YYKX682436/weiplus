package com.tencent.mm.storage;

/* loaded from: classes6.dex */
public class r5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f195274d = 0;

    public r5(com.tencent.mm.storage.s5 s5Var, com.tencent.mm.storage.q5 q5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f195274d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f195274d;
        this.f195274d = i17 + 1;
        if (i17 == 0) {
            return h01.w.INSTANCE;
        }
        if (i17 == 1) {
            return h01.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
