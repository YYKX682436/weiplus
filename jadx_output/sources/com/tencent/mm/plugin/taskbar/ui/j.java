package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f172628d = 0;

    public j(com.tencent.mm.plugin.taskbar.ui.k kVar, com.tencent.mm.plugin.taskbar.ui.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f172628d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f172628d;
        this.f172628d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.taskbar.ui.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
