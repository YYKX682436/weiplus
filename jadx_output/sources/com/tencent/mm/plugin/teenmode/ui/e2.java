package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class e2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172977d = 0;

    public e2(com.tencent.mm.plugin.teenmode.ui.f2 f2Var, com.tencent.mm.plugin.teenmode.ui.d2 d2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172977d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172977d;
        this.f172977d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.teenmode.ui.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
