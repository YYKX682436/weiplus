package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126061d = 0;

    public h(com.tencent.mm.plugin.finder.service.i iVar, com.tencent.mm.plugin.finder.service.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126061d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126061d;
        this.f126061d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
