package com.tencent.mm.plugin.finder.report;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f124986d = 0;

    public d(com.tencent.mm.plugin.finder.report.e eVar, com.tencent.mm.plugin.finder.report.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f124986d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f124986d;
        this.f124986d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.report.p3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
