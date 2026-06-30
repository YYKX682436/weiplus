package com.tencent.mm.wexnet;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f214364d = 0;

    public i(com.tencent.mm.wexnet.j jVar, com.tencent.mm.wexnet.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f214364d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f214364d;
        this.f214364d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.wexnet.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
