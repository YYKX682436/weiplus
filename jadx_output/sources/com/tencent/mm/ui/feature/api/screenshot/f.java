package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f208472d = 0;

    public f(com.tencent.mm.ui.feature.api.screenshot.g gVar, com.tencent.mm.ui.feature.api.screenshot.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f208472d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f208472d;
        this.f208472d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.feature.api.screenshot.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
