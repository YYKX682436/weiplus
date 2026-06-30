package com.tencent.mm.plugin.game.luggage.jsevent;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f139786d = 0;

    public b(com.tencent.mm.plugin.game.luggage.jsevent.c cVar, com.tencent.mm.plugin.game.luggage.jsevent.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f139786d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f139786d;
        this.f139786d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.luggage.jsevent.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
