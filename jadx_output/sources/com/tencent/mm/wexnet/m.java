package com.tencent.mm.wexnet;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f214367d = 0;

    public m(com.tencent.mm.wexnet.n nVar, com.tencent.mm.wexnet.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f214367d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f214367d;
        this.f214367d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.wexnet.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
