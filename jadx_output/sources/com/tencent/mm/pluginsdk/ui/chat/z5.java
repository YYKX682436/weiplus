package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes6.dex */
public class z5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f190771d = 0;

    public z5(com.tencent.mm.pluginsdk.ui.chat.a6 a6Var, com.tencent.mm.pluginsdk.ui.chat.y5 y5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f190771d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f190771d;
        this.f190771d = i17 + 1;
        if (i17 == 0) {
            return g30.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
