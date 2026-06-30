package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148174d = 0;

    public v(com.tencent.mm.plugin.magicbrush.w wVar, com.tencent.mm.plugin.magicbrush.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148174d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148174d;
        this.f148174d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.p6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
