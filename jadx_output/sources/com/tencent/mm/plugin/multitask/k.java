package com.tencent.mm.plugin.multitask;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150460d = 0;

    public k(com.tencent.mm.plugin.multitask.l lVar, com.tencent.mm.plugin.multitask.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150460d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150460d;
        this.f150460d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.multitask.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
