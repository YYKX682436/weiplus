package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145478d = 0;

    public o(com.tencent.mm.plugin.luckymoney.model.p pVar, com.tencent.mm.plugin.luckymoney.model.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145478d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145478d;
        this.f145478d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.luckymoney.model.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
