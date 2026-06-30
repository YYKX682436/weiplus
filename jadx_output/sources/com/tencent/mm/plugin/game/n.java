package com.tencent.mm.plugin.game;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f140572d = 0;

    public n(com.tencent.mm.plugin.game.o oVar, com.tencent.mm.plugin.game.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140572d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f140572d;
        this.f140572d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
