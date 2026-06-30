package com.tencent.mm.ui.tools;

/* loaded from: classes6.dex */
public class g3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f210437d = 0;

    public g3(com.tencent.mm.ui.tools.h3 h3Var, com.tencent.mm.ui.tools.f3 f3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f210437d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f210437d;
        this.f210437d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.tools.jd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
