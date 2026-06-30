package com.tencent.mm.ui;

/* loaded from: classes6.dex */
public class j4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f208996d = 0;

    public j4(com.tencent.mm.ui.k4 k4Var, com.tencent.mm.ui.i4 i4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f208996d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f208996d;
        this.f208996d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.c9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
