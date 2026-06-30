package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126208d = 0;

    public t(com.tencent.mm.plugin.finder.service.u uVar, com.tencent.mm.plugin.finder.service.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126208d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126208d;
        this.f126208d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
