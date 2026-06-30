package com.tencent.mm.ui.chatting;

/* loaded from: classes6.dex */
public class aa implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f198371d = 0;

    public aa(com.tencent.mm.ui.chatting.ba baVar, com.tencent.mm.ui.chatting.z9 z9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f198371d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f198371d;
        this.f198371d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.gd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
