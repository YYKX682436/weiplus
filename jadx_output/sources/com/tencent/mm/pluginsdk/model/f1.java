package com.tencent.mm.pluginsdk.model;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189296d = 0;

    public f1(com.tencent.mm.pluginsdk.model.g1 g1Var, com.tencent.mm.pluginsdk.model.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189296d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189296d;
        this.f189296d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
