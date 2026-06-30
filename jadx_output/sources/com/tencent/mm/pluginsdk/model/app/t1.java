package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class t1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189082d = 0;

    public t1(com.tencent.mm.pluginsdk.model.app.u1 u1Var, com.tencent.mm.pluginsdk.model.app.s1 s1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189082d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189082d;
        this.f189082d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
