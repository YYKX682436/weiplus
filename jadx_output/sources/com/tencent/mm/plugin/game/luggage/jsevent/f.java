package com.tencent.mm.plugin.game.luggage.jsevent;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f139789d = 0;

    public f(com.tencent.mm.plugin.game.luggage.jsevent.g gVar, com.tencent.mm.plugin.game.luggage.jsevent.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f139789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f139789d;
        this.f139789d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.luggage.jsevent.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
