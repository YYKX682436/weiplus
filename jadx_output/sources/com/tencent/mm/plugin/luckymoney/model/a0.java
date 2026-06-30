package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145157d = 0;

    public a0(com.tencent.mm.plugin.luckymoney.model.b0 b0Var, com.tencent.mm.plugin.luckymoney.model.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145157d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145157d;
        this.f145157d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.luckymoney.model.a3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
