package com.tencent.mm.udr;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196502d = 0;

    public n(com.tencent.mm.udr.o oVar, com.tencent.mm.udr.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196502d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196502d;
        this.f196502d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.udr.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
