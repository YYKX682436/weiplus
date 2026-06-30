package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class j0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126084d = 0;

    public j0(com.tencent.mm.plugin.finder.service.k0 k0Var, com.tencent.mm.plugin.finder.service.i0 i0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126084d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126084d;
        this.f126084d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.r4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
