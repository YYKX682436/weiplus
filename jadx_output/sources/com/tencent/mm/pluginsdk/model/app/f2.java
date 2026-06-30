package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class f2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188889d = 0;

    public f2(com.tencent.mm.pluginsdk.model.app.g2 g2Var, com.tencent.mm.pluginsdk.model.app.e2 e2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188889d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188889d;
        this.f188889d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
