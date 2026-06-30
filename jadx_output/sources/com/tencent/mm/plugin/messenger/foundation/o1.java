package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes6.dex */
public class o1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148704d = 0;

    public o1(com.tencent.mm.plugin.messenger.foundation.p1 p1Var, com.tencent.mm.plugin.messenger.foundation.n1 n1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148704d;
        this.f148704d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.messenger.foundation.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
