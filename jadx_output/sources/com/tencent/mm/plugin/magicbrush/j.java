package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148030d = 0;

    public j(com.tencent.mm.plugin.magicbrush.k kVar, com.tencent.mm.plugin.magicbrush.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148030d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148030d;
        this.f148030d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.g6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
