package com.tencent.mm.vfs;

/* loaded from: classes6.dex */
public class s1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f213171d = 0;

    public s1(com.tencent.mm.vfs.t1 t1Var, com.tencent.mm.vfs.r1 r1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f213171d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f213171d;
        this.f213171d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.vfs.j7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
