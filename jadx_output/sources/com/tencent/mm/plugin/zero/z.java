package com.tencent.mm.plugin.zero;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188691d = 0;

    public z(com.tencent.mm.plugin.zero.a0 a0Var, com.tencent.mm.plugin.zero.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188691d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188691d;
        this.f188691d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.zero.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
