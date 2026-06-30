package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126186d = 0;

    public r0(com.tencent.mm.plugin.finder.service.s0 s0Var, com.tencent.mm.plugin.finder.service.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126186d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126186d;
        this.f126186d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.y4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
