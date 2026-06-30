package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f191197d = 0;

    public d(com.tencent.mm.pluginsdk.ui.span.e eVar, com.tencent.mm.pluginsdk.ui.span.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f191197d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f191197d;
        this.f191197d = i17 + 1;
        if (i17 == 0) {
            return ez.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
