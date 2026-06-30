package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o1 f202209d;

    public f1(com.tencent.mm.ui.chatting.presenter.o1 o1Var) {
        this.f202209d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb5.e eVar;
        com.tencent.mm.ui.chatting.presenter.o1 o1Var = this.f202209d;
        java.util.List list = o1Var.f202390f;
        if (list == null || (eVar = o1Var.f202393i) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI) eVar).U6(false, list);
    }
}
