package com.tencent.mm.udr;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196514d = 0;

    public v(com.tencent.mm.udr.w wVar, com.tencent.mm.udr.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196514d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196514d;
        this.f196514d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.udr.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
