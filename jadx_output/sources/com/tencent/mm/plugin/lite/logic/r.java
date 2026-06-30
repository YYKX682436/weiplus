package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f144049d = 0;

    public r(com.tencent.mm.plugin.lite.logic.s sVar, com.tencent.mm.plugin.lite.logic.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f144049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f144049d;
        this.f144049d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.lite.logic.w2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
