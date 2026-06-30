package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f140447d = 0;

    public d(com.tencent.mm.plugin.game.model.silent_download.e eVar, com.tencent.mm.plugin.game.model.silent_download.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140447d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f140447d;
        this.f140447d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.model.silent_download.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
