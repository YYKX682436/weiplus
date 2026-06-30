package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class a2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172927d = 0;

    public a2(com.tencent.mm.plugin.teenmode.ui.b2 b2Var, com.tencent.mm.plugin.teenmode.ui.z1 z1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172927d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172927d;
        this.f172927d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.teenmode.ui.r1.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.teenmode.ui.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
