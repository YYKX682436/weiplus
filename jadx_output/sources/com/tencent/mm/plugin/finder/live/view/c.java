package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f116218d = 0;

    public c(com.tencent.mm.plugin.finder.live.view.d dVar, com.tencent.mm.plugin.finder.live.view.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f116218d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f116218d;
        this.f116218d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.live.view.n7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
