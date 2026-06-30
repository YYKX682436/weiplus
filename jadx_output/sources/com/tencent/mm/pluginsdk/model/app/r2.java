package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class r2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189054d = 0;

    public r2(com.tencent.mm.pluginsdk.model.app.s2 s2Var, com.tencent.mm.pluginsdk.model.app.q2 q2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189054d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189054d;
        this.f189054d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.t3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
