package com.tencent.mm.ui.chatting.component;

/* loaded from: classes6.dex */
public class eb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f198965d = 0;

    public eb(com.tencent.mm.ui.chatting.component.fb fbVar, com.tencent.mm.ui.chatting.component.db dbVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f198965d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f198965d;
        this.f198965d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.component.yk.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
