package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152584d = 0;

    public b(com.tencent.mm.plugin.offline.ui.c cVar, com.tencent.mm.plugin.offline.ui.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152584d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152584d;
        this.f152584d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.offline.ui.n1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
