package com.tencent.mm.plugin.sns.model;

/* loaded from: classes6.dex */
public class c1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f164112d = 0;

    public c1(com.tencent.mm.plugin.sns.model.d1 d1Var, com.tencent.mm.plugin.sns.model.b1 b1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f164112d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f164112d;
        this.f164112d = i17 + 1;
        if (i17 == 0) {
            return ge0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
