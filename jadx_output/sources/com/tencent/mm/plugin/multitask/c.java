package com.tencent.mm.plugin.multitask;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150422d = 0;

    public c(com.tencent.mm.plugin.multitask.d dVar, com.tencent.mm.plugin.multitask.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150422d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150422d;
        this.f150422d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.multitask.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
