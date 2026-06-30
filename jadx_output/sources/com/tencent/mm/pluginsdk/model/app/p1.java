package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189029d = 0;

    public p1(com.tencent.mm.pluginsdk.model.app.q1 q1Var, com.tencent.mm.pluginsdk.model.app.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189029d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189029d;
        this.f189029d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
