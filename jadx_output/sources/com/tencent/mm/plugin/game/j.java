package com.tencent.mm.plugin.game;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f139461d = 0;

    public j(com.tencent.mm.plugin.game.k kVar, com.tencent.mm.plugin.game.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f139461d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f139461d;
        this.f139461d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
