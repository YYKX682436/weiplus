package com.tencent.mm.plugin.profile;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f153389d = 0;

    public b0(com.tencent.mm.plugin.profile.c0 c0Var, com.tencent.mm.plugin.profile.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f153389d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f153389d;
        this.f153389d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.profile.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
