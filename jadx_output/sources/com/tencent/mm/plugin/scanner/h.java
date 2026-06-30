package com.tencent.mm.plugin.scanner;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f158728d = 0;

    public h(com.tencent.mm.plugin.scanner.i iVar, com.tencent.mm.plugin.scanner.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f158728d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f158728d;
        this.f158728d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.scanner.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
