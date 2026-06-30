package com.tencent.mm.plugin.multitask;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150434d = 0;

    public g(com.tencent.mm.plugin.multitask.h hVar, com.tencent.mm.plugin.multitask.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150434d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150434d;
        this.f150434d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.multitask.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
