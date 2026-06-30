package com.tencent.mm.udr;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f196483d = 0;

    public f(com.tencent.mm.udr.g gVar, com.tencent.mm.udr.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196483d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f196483d;
        this.f196483d = i17 + 1;
        if (i17 == 0) {
            return fa5.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
