package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f174751d = 0;

    public f(com.tencent.mm.plugin.ting.uic.g gVar, com.tencent.mm.plugin.ting.uic.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f174751d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f174751d;
        this.f174751d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.ting.uic.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
