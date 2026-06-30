package com.tencent.mm.plugin.scanner;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f159138d = 0;

    public t(com.tencent.mm.plugin.scanner.u uVar, com.tencent.mm.plugin.scanner.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f159138d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f159138d;
        this.f159138d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.scanner.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
