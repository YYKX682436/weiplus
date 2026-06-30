package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o1 f202318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f202319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202320f;

    public l1(com.tencent.mm.ui.chatting.presenter.o1 o1Var, boolean z17, java.util.List list) {
        this.f202318d = o1Var;
        this.f202319e = z17;
        this.f202320f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb5.e eVar;
        com.tencent.mm.ui.chatting.presenter.o1 o1Var = this.f202318d;
        if (o1Var.f202393i == null || o1Var.f202394m.get() || (eVar = o1Var.f202393i) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI) eVar).U6(this.f202319e, this.f202320f);
    }
}
