package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class p5 implements java.util.Comparator {
    public p5(com.tencent.mm.ui.chatting.presenter.b6 b6Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((long[]) obj2)[1], ((long[]) obj)[1]);
    }
}
