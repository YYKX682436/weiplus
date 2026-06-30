package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172115d = 0;

    public b(com.tencent.mm.plugin.subapp.jdbiz.c cVar, com.tencent.mm.plugin.subapp.jdbiz.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172115d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172115d;
        this.f172115d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.subapp.jdbiz.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
