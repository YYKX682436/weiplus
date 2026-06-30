package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class l0 implements java.util.Comparator {
    public l0(com.tencent.mm.ui.chatting.presenter.z0 z0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((long[]) obj2)[1], ((long[]) obj)[1]);
    }
}
