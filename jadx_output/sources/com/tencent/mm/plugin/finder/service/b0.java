package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126006d = 0;

    public b0(com.tencent.mm.plugin.finder.service.c0 c0Var, com.tencent.mm.plugin.finder.service.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126006d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126006d;
        this.f126006d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
