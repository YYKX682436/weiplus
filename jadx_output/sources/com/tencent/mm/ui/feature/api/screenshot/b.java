package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f208459d = 0;

    public b(com.tencent.mm.ui.feature.api.screenshot.c cVar, com.tencent.mm.ui.feature.api.screenshot.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f208459d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f208459d;
        this.f208459d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.feature.api.screenshot.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
