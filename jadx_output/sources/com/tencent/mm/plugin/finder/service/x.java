package com.tencent.mm.plugin.finder.service;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126250d = 0;

    public x(com.tencent.mm.plugin.finder.service.y yVar, com.tencent.mm.plugin.finder.service.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126250d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126250d;
        this.f126250d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.x2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
