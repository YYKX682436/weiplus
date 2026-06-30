package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class x5 implements com.tencent.mm.ui.chatting.adapter.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.b6 f202540a;

    public x5(com.tencent.mm.ui.chatting.presenter.b6 b6Var) {
        this.f202540a = b6Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void a(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        com.tencent.mm.ui.chatting.presenter.z5 z5Var = (com.tencent.mm.ui.chatting.presenter.z5) f0Var;
        com.tencent.mm.ui.chatting.presenter.b6 b6Var = this.f202540a;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(b6Var.f202542e, z5Var.f198411d);
        b6Var.getClass();
        de5.a.f229396a.k(5, 11, 12);
        int ordinal = z5Var.f202589j.ordinal();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SEARCH;
        java.lang.String str = z5Var.f198412e;
        if (ordinal == 0) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "click SHOP item", null);
            ((b00.r) ((c00.z2) i95.n0.c(c00.z2.class))).pj(view.getContext(), str, Li, x8Var);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "click PRODUCT item", null);
        ((b00.r) ((c00.z2) i95.n0.c(c00.z2.class))).ij(view.getContext(), str, Li, x8Var);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void b(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShopAndProductListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.chatting.presenter.b6 b6Var = this.f202540a;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(b6Var.f202542e, f0Var.f198411d);
        b6Var.getClass();
        de5.a.f229396a.k(14, 11, 12);
        new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, new com.tencent.mm.ui.chatting.presenter.v5(this), new com.tencent.mm.ui.chatting.presenter.w5(this, Li), null);
    }
}
