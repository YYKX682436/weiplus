package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes6.dex */
public class v5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f190693d = 0;

    public v5(com.tencent.mm.pluginsdk.ui.chat.w5 w5Var, com.tencent.mm.pluginsdk.ui.chat.u5 u5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f190693d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f190693d;
        this.f190693d = i17 + 1;
        if (i17 == 0) {
            return g30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
