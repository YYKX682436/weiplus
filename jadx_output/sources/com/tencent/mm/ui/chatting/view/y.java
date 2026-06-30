package com.tencent.mm.ui.chatting.view;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f203152d = 0;

    public y(com.tencent.mm.ui.chatting.view.z zVar, com.tencent.mm.ui.chatting.view.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f203152d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f203152d;
        this.f203152d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.view.o2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
