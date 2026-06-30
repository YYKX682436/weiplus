package com.tencent.mm.ui.chatting.component;

/* loaded from: classes6.dex */
public class fb implements java.lang.Iterable {
    public fb(com.tencent.mm.ui.chatting.component.db dbVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new com.tencent.mm.ui.chatting.component.eb(this, null);
    }
}
