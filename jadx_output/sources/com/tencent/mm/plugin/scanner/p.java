package com.tencent.mm.plugin.scanner;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f159120d = 0;

    public p(com.tencent.mm.plugin.scanner.q qVar, com.tencent.mm.plugin.scanner.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f159120d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f159120d;
        this.f159120d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.scanner.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
