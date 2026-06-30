package com.tencent.mm.plugin.game;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f138700d = 0;

    public b(com.tencent.mm.plugin.game.c cVar, com.tencent.mm.plugin.game.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f138700d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f138700d;
        this.f138700d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
