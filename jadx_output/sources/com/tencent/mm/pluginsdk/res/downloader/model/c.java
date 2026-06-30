package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f189667d = 0;

    public c(com.tencent.mm.pluginsdk.res.downloader.model.d dVar, com.tencent.mm.pluginsdk.res.downloader.model.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f189667d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f189667d;
        this.f189667d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.res.downloader.model.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
