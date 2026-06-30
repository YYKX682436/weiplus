package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f144862d = 0;

    public p(com.tencent.mm.plugin.location.ui.impl.q qVar, com.tencent.mm.plugin.location.ui.impl.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f144862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f144862d;
        this.f144862d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.location.ui.impl.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
