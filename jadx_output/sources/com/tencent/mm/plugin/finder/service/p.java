package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126166d = 0;

    public p(com.tencent.mm.plugin.finder.service.q qVar, com.tencent.mm.plugin.finder.service.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126166d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126166d;
        this.f126166d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
