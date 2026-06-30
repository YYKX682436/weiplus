package com.tencent.mm.pluginsdk.model;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189223d = 0;

    public b1(com.tencent.mm.pluginsdk.model.c1 c1Var, com.tencent.mm.pluginsdk.model.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189223d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189223d;
        this.f189223d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
