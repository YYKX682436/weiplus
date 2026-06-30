package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f139550d = 0;

    public f(com.tencent.mm.plugin.game.luggage.g gVar, com.tencent.mm.plugin.game.luggage.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f139550d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f139550d;
        this.f139550d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.luggage.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
