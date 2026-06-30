package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class v2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189105d = 0;

    public v2(com.tencent.mm.pluginsdk.model.app.w2 w2Var, com.tencent.mm.pluginsdk.model.app.u2 u2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189105d;
        this.f189105d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.w5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
