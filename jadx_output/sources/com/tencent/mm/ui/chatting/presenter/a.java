package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class a implements java.util.Comparator {
    public a(com.tencent.mm.ui.chatting.presenter.b bVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((com.tencent.mm.ui.chatting.presenter.l) obj2).f202317o.getCreateTime(), ((com.tencent.mm.ui.chatting.presenter.l) obj).f202317o.getCreateTime());
    }
}
