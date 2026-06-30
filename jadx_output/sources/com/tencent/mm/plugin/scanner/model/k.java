package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158942d = 0;

    public k(com.tencent.mm.plugin.scanner.model.l lVar, com.tencent.mm.plugin.scanner.model.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158942d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158942d;
        this.f158942d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.scanner.model.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
