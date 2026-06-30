package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f191212d = 0;

    public h(com.tencent.mm.pluginsdk.ui.span.i iVar, com.tencent.mm.pluginsdk.ui.span.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f191212d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f191212d;
        this.f191212d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.smiley.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
