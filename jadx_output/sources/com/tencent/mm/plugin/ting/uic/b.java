package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f174737d = 0;

    public b(com.tencent.mm.plugin.ting.uic.c cVar, com.tencent.mm.plugin.ting.uic.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f174737d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f174737d;
        this.f174737d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.ting.uic.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
