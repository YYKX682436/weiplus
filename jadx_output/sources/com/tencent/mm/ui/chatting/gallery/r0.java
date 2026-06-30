package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f201317d = 0;

    public r0(com.tencent.mm.ui.chatting.gallery.s0 s0Var, com.tencent.mm.ui.chatting.gallery.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f201317d < 4;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f201317d;
        this.f201317d = i17 + 1;
        if (i17 == 0) {
            return mc5.u.INSTANCE;
        }
        if (i17 == 1) {
            return mc5.r.INSTANCE;
        }
        if (i17 == 2) {
            return mc5.y.INSTANCE;
        }
        if (i17 == 3) {
            return mc5.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 4");
    }
}
