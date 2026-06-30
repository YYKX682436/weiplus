package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class q4 implements java.util.Comparator {
    public q4(com.tencent.mm.ui.chatting.presenter.y4 y4Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((long[]) obj2)[1], ((long[]) obj)[1]);
    }
}
