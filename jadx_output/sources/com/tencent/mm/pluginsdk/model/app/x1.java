package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class x1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189137d = 0;

    public x1(com.tencent.mm.pluginsdk.model.app.y1 y1Var, com.tencent.mm.pluginsdk.model.app.w1 w1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189137d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189137d;
        this.f189137d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
