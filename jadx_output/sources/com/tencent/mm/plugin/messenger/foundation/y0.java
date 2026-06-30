package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes6.dex */
public class y0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148756d = 0;

    public y0(com.tencent.mm.plugin.messenger.foundation.z0 z0Var, com.tencent.mm.plugin.messenger.foundation.x0 x0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148756d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148756d;
        this.f148756d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.messenger.foundation.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
