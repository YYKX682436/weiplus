package com.tencent.mm.plugin.voip.model;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f176804d = 0;

    public u(com.tencent.mm.plugin.voip.model.v vVar, com.tencent.mm.plugin.voip.model.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f176804d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f176804d;
        this.f176804d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.voip.model.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
