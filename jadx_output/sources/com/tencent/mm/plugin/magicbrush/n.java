package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148077d = 0;

    public n(com.tencent.mm.plugin.magicbrush.o oVar, com.tencent.mm.plugin.magicbrush.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148077d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148077d;
        this.f148077d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.j6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
