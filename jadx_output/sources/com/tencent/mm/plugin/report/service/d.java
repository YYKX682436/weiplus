package com.tencent.mm.plugin.report.service;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158157d = 0;

    public d(com.tencent.mm.plugin.report.service.e eVar, com.tencent.mm.plugin.report.service.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158157d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158157d;
        this.f158157d = i17 + 1;
        if (i17 == 0) {
            return lx3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
