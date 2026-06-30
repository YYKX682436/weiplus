package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126021d = 0;

    public d(com.tencent.mm.plugin.finder.service.e eVar, com.tencent.mm.plugin.finder.service.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126021d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126021d;
        this.f126021d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
