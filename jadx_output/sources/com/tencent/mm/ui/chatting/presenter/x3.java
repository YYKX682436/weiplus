package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class x3 implements com.tencent.mm.ui.chatting.adapter.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o3 f202537a;

    public x3(com.tencent.mm.ui.chatting.presenter.o3 o3Var) {
        this.f202537a = o3Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void a(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        if (com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(view.getContext(), null)) {
            com.tencent.mm.ui.chatting.presenter.o3 o3Var = this.f202537a;
            o3Var.getClass();
            de5.a.f229396a.k(5, 3, 4);
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(o3Var.f202542e, f0Var.f198411d);
            com.tencent.mm.ui.chatting.o6.f202065a.d(o3Var.f202541d, Li, ot0.q.v(Li.j()));
        }
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void b(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        this.f202537a.getClass();
        de5.a.f229396a.k(14, 3, 4);
        new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, new com.tencent.mm.ui.chatting.presenter.v3(this), new com.tencent.mm.ui.chatting.presenter.w3(this, f0Var), null);
    }
}
