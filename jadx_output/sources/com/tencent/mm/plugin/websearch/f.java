package com.tencent.mm.plugin.websearch;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f181500d = 0;

    public f(com.tencent.mm.plugin.websearch.g gVar, com.tencent.mm.plugin.websearch.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f181500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f181500d;
        this.f181500d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.websearch.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
