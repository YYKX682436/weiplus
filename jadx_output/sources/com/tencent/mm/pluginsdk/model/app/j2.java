package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class j2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188945d = 0;

    public j2(com.tencent.mm.pluginsdk.model.app.k2 k2Var, com.tencent.mm.pluginsdk.model.app.i2 i2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188945d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188945d;
        this.f188945d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.e3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
