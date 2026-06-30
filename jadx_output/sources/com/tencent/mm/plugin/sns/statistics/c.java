package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f164841d = 0;

    public c(com.tencent.mm.plugin.sns.statistics.d dVar, com.tencent.mm.plugin.sns.statistics.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f164841d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f164841d;
        this.f164841d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.sns.statistics.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
