package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public class x4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f208230d = 0;

    public x4(com.tencent.mm.ui.conversation.y4 y4Var, com.tencent.mm.ui.conversation.w4 w4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f208230d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f208230d;
        this.f208230d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.conversation.t3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
