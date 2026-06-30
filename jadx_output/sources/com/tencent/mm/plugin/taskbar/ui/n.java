package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172649d = 0;

    public n(com.tencent.mm.plugin.taskbar.ui.o oVar, com.tencent.mm.plugin.taskbar.ui.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172649d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172649d;
        this.f172649d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.taskbar.ui.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
