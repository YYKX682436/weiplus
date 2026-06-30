package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f126797d = 0;

    public g(com.tencent.mm.plugin.finder.storage.h hVar, com.tencent.mm.plugin.finder.storage.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126797d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f126797d;
        this.f126797d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.storage.nj0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
