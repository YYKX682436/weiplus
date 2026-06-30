package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145594d = 0;

    public s(com.tencent.mm.plugin.luckymoney.model.t tVar, com.tencent.mm.plugin.luckymoney.model.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145594d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145594d;
        this.f145594d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.luckymoney.model.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
