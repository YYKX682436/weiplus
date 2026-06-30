package com.tencent.mm.plugin.zero;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188682d = 0;

    public v(com.tencent.mm.plugin.zero.w wVar, com.tencent.mm.plugin.zero.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188682d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188682d;
        this.f188682d = i17 + 1;
        if (i17 == 0) {
            return bt.p1.INSTANCE;
        }
        if (i17 == 1) {
            return bt.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
