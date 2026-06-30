package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f140450d = 0;

    public h(com.tencent.mm.plugin.game.model.silent_download.i iVar, com.tencent.mm.plugin.game.model.silent_download.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140450d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f140450d;
        this.f140450d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.model.silent_download.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
