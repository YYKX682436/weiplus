package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o1 f202190d;

    public e1(com.tencent.mm.ui.chatting.presenter.o1 o1Var) {
        this.f202190d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb5.e eVar;
        com.tencent.mm.ui.chatting.presenter.o1 o1Var = this.f202190d;
        java.util.List list = o1Var.f202390f;
        if (list == null || (eVar = o1Var.f202393i) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI) eVar).U6(false, list);
    }
}
