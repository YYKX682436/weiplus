package com.tencent.mm.plugin.game;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f140621d = 0;

    public r(com.tencent.mm.plugin.game.s sVar, com.tencent.mm.plugin.game.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140621d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f140621d;
        this.f140621d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
