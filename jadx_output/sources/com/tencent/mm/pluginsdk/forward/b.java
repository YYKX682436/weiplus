package com.tencent.mm.pluginsdk.forward;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f188699d = 0;

    public b(com.tencent.mm.pluginsdk.forward.c cVar, com.tencent.mm.pluginsdk.forward.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f188699d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f188699d;
        this.f188699d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.forward.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
