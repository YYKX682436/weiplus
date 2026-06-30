package com.tencent.mm.udr;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196497d = 0;

    public j(com.tencent.mm.udr.k kVar, com.tencent.mm.udr.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196497d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196497d;
        this.f196497d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.udr.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
