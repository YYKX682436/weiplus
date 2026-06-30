package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f139538d = 0;

    public b(com.tencent.mm.plugin.game.luggage.c cVar, com.tencent.mm.plugin.game.luggage.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f139538d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f139538d;
        this.f139538d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.luggage.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
