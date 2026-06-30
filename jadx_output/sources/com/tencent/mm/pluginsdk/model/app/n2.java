package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class n2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188993d = 0;

    public n2(com.tencent.mm.pluginsdk.model.app.o2 o2Var, com.tencent.mm.pluginsdk.model.app.m2 m2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188993d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188993d;
        this.f188993d = i17 + 1;
        if (i17 == 0) {
            return mt.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
