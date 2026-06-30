package com.tencent.mm.pluginsdk.model;

/* loaded from: classes6.dex */
public class t0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189437d = 0;

    public t0(com.tencent.mm.pluginsdk.model.u0 u0Var, com.tencent.mm.pluginsdk.model.s0 s0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189437d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189437d;
        this.f189437d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
