package com.tencent.mm.ui.chatting.component;

/* loaded from: classes6.dex */
public class ab implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f198616d = 0;

    public ab(com.tencent.mm.ui.chatting.component.bb bbVar, com.tencent.mm.ui.chatting.component.za zaVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f198616d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f198616d;
        this.f198616d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.component.uj.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
