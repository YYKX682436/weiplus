package com.tencent.mm.sdk.platformtools;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f192516d = 0;

    public d1(com.tencent.mm.sdk.platformtools.e1 e1Var, com.tencent.mm.sdk.platformtools.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f192516d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f192516d;
        this.f192516d = i17 + 1;
        if (i17 == 0) {
            return ll3.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
