package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class x1 implements com.tencent.mm.ui.chatting.adapter.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.p1 f202534a;

    public x1(com.tencent.mm.ui.chatting.presenter.p1 p1Var) {
        this.f202534a = p1Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void a(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        com.tencent.mm.ui.chatting.presenter.p1 p1Var = this.f202534a;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(p1Var.f202542e, ((com.tencent.mm.ui.chatting.presenter.y1) f0Var).f198411d);
        p1Var.getClass();
        de5.a.f229396a.k(5, 12, 13);
        ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).uj(view.getContext(), Li, null);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void b(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GiftHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        this.f202534a.getClass();
        de5.a.f229396a.k(14, 12, 13);
        new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, new com.tencent.mm.ui.chatting.presenter.v1(this), new com.tencent.mm.ui.chatting.presenter.w1(this, f0Var), null);
    }
}
