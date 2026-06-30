package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126109d = 0;

    public l(com.tencent.mm.plugin.finder.service.m mVar, com.tencent.mm.plugin.finder.service.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126109d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126109d;
        this.f126109d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.t1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
