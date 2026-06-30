package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f181359d = 0;

    public c(com.tencent.mm.plugin.walletlock.model.d dVar, com.tencent.mm.plugin.walletlock.model.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f181359d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f181359d;
        this.f181359d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.walletlock.model.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
