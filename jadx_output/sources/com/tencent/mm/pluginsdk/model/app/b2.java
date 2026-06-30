package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes6.dex */
public class b2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188817d = 0;

    public b2(com.tencent.mm.pluginsdk.model.app.c2 c2Var, com.tencent.mm.pluginsdk.model.app.a2 a2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188817d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188817d;
        this.f188817d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
