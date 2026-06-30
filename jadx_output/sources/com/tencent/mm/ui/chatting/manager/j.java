package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f201971d = 0;

    public j(com.tencent.mm.ui.chatting.manager.k kVar, com.tencent.mm.ui.chatting.manager.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f201971d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f201971d;
        this.f201971d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.manager.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
