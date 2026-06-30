package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172118d = 0;

    public f(com.tencent.mm.plugin.subapp.jdbiz.g gVar, com.tencent.mm.plugin.subapp.jdbiz.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172118d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172118d;
        this.f172118d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.subapp.jdbiz.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
