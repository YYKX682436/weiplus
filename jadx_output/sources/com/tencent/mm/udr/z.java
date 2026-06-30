package com.tencent.mm.udr;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196528d = 0;

    public z(com.tencent.mm.udr.a0 a0Var, com.tencent.mm.udr.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196528d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196528d;
        this.f196528d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.udr.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
