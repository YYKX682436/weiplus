package com.tencent.mm.wexnet;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f214361d = 0;

    public e(com.tencent.mm.wexnet.f fVar, com.tencent.mm.wexnet.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f214361d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f214361d;
        this.f214361d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.wexnet.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
