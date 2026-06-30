package com.tencent.mm.ui.conversation;

/* loaded from: classes6.dex */
public class p4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f207960d = 0;

    public p4(com.tencent.mm.ui.conversation.q4 q4Var, com.tencent.mm.ui.conversation.o4 o4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f207960d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f207960d;
        this.f207960d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.conversation.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
