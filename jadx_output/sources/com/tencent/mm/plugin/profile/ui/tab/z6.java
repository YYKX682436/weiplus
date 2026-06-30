package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes6.dex */
public class z6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f154714d = 0;

    public z6(com.tencent.mm.plugin.profile.ui.tab.a7 a7Var, com.tencent.mm.plugin.profile.ui.tab.y6 y6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f154714d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f154714d;
        this.f154714d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.profile.ui.tab.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
