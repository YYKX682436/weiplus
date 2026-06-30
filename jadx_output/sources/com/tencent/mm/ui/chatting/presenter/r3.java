package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class r3 implements java.util.Comparator {
    public r3(com.tencent.mm.ui.chatting.presenter.o3 o3Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((long[]) obj2)[1], ((long[]) obj)[1]);
    }
}
