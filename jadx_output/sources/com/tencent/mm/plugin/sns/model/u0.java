package com.tencent.mm.plugin.sns.model;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f164698d = 0;

    public u0(com.tencent.mm.plugin.sns.model.v0 v0Var, com.tencent.mm.plugin.sns.model.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f164698d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f164698d;
        this.f164698d = i17 + 1;
        if (i17 == 0) {
            return fa4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
