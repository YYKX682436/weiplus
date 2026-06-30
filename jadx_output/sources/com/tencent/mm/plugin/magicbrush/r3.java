package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class r3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148111d = 0;

    public r3(com.tencent.mm.plugin.magicbrush.s3 s3Var, com.tencent.mm.plugin.magicbrush.q3 q3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148111d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148111d;
        this.f148111d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.l7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
