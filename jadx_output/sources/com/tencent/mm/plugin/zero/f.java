package com.tencent.mm.plugin.zero;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188634d = 0;

    public f(com.tencent.mm.plugin.zero.g gVar, com.tencent.mm.plugin.zero.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188634d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188634d;
        this.f188634d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.zero.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
