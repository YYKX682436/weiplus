package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class n0 implements java.util.Comparator {
    public n0(com.tencent.mm.ui.chatting.presenter.z0 z0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.storage.f9) obj2).getCreateTime(), ((com.tencent.mm.storage.f9) obj).getCreateTime());
    }
}
