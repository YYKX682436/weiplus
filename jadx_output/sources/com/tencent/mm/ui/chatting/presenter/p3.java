package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class p3 implements java.util.Comparator {
    public p3(com.tencent.mm.ui.chatting.presenter.q3 q3Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.ui.chatting.presenter.a4) obj2).f202109a.getCreateTime(), ((com.tencent.mm.ui.chatting.presenter.a4) obj).f202109a.getCreateTime());
    }
}
