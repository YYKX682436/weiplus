package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class n0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126152d = 0;

    public n0(com.tencent.mm.plugin.finder.service.o0 o0Var, com.tencent.mm.plugin.finder.service.m0 m0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126152d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126152d;
        this.f126152d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.u4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
