package com.tencent.mm.plugin.sns.model;

/* loaded from: classes6.dex */
public class q0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f164586d = 0;

    public q0(com.tencent.mm.plugin.sns.model.r0 r0Var, com.tencent.mm.plugin.sns.model.p0 p0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f164586d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f164586d;
        this.f164586d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.sns.model.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
