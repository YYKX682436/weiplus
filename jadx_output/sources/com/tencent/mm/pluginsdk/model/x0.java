package com.tencent.mm.pluginsdk.model;

/* loaded from: classes.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189496d = 0;

    public x0(com.tencent.mm.pluginsdk.model.y0 y0Var, com.tencent.mm.pluginsdk.model.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189496d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189496d;
        this.f189496d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
