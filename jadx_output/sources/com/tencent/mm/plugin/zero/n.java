package com.tencent.mm.plugin.zero;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188663d = 0;

    public n(com.tencent.mm.plugin.zero.o oVar, com.tencent.mm.plugin.zero.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188663d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188663d;
        this.f188663d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.zero.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
