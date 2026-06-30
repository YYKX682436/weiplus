package com.tencent.mm.plugin.game.commlib;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f139378d = 0;

    public f(com.tencent.mm.plugin.game.commlib.g gVar, com.tencent.mm.plugin.game.commlib.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f139378d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f139378d;
        this.f139378d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.commlib.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
