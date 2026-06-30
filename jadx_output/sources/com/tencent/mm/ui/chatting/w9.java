package com.tencent.mm.ui.chatting;

/* loaded from: classes6.dex */
public class w9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f206216d = 0;

    public w9(com.tencent.mm.ui.chatting.x9 x9Var, com.tencent.mm.ui.chatting.v9 v9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f206216d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f206216d;
        this.f206216d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.p2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
