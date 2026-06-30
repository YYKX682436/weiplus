package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class c implements java.util.Comparator {
    public c(com.tencent.mm.ui.chatting.presenter.n nVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((long[]) obj2)[1], ((long[]) obj)[1]);
    }
}
