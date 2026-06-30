package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158906d = 0;

    public g(com.tencent.mm.plugin.scanner.model.h hVar, com.tencent.mm.plugin.scanner.model.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158906d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158906d;
        this.f158906d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.scanner.model.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
