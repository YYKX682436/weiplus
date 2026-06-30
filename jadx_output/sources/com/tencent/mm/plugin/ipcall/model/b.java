package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f142461d = 0;

    public b(com.tencent.mm.plugin.ipcall.model.c cVar, com.tencent.mm.plugin.ipcall.model.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f142461d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f142461d;
        this.f142461d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.ipcall.model.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
