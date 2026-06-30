package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150043d = 0;

    public m(com.tencent.mm.plugin.multitalk.model.n nVar, com.tencent.mm.plugin.multitalk.model.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150043d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150043d;
        this.f150043d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.multitalk.model.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
