package com.tencent.mm.plugin.game;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f141912d = 0;

    public v(com.tencent.mm.plugin.game.w wVar, com.tencent.mm.plugin.game.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f141912d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f141912d;
        this.f141912d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
