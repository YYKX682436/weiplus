package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes6.dex */
public class d6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f190264d = 0;

    public d6(com.tencent.mm.pluginsdk.ui.chat.e6 e6Var, com.tencent.mm.pluginsdk.ui.chat.c6 c6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f190264d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f190264d;
        this.f190264d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.ui.chat.q9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
