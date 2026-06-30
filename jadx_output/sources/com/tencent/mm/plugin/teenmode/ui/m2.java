package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class m2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f173070d = 0;

    public m2(com.tencent.mm.plugin.teenmode.ui.n2 n2Var, com.tencent.mm.plugin.teenmode.ui.l2 l2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f173070d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f173070d;
        this.f173070d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.teenmode.ui.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
