package com.tencent.mm.plugin.multitask;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150500d = 0;

    public s(com.tencent.mm.plugin.multitask.t tVar, com.tencent.mm.plugin.multitask.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150500d;
        this.f150500d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.multitask.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
