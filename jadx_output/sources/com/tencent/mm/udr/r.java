package com.tencent.mm.udr;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196505d = 0;

    public r(com.tencent.mm.udr.s sVar, com.tencent.mm.udr.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196505d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196505d;
        this.f196505d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.udr.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
