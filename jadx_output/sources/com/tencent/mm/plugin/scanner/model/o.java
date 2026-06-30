package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158965d = 0;

    public o(com.tencent.mm.plugin.scanner.model.p pVar, com.tencent.mm.plugin.scanner.model.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158965d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158965d;
        this.f158965d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.scanner.model.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
