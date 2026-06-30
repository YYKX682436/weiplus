package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class g5 implements com.tencent.mm.ui.chatting.adapter.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m5 f202231a;

    public g5(com.tencent.mm.ui.chatting.presenter.m5 m5Var) {
        this.f202231a = m5Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void a(android.view.View v17, int i17, com.tencent.mm.ui.chatting.adapter.f0 inputItem) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(inputItem, "inputItem");
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.ui.chatting.presenter.m5 m5Var = this.f202231a;
        com.tencent.mm.storage.f9 n17 = e0Var.n(m5Var.f202542e, ((com.tencent.mm.ui.chatting.presenter.z4) inputItem).f198411d);
        m5Var.getClass();
        de5.a.f229396a.k(5, 8, 9);
        android.content.Context context = v17.getContext();
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str = V1;
        java.lang.String j17 = n17.j();
        if (j17 == null) {
            j17 = "";
        }
        com.tencent.mm.ui.chatting.viewitems.wg.a(context, str, j17, com.tencent.mm.storage.z3.R4(n17.Q0()), n17.A0() == 0, n17);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void b(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.chatting.presenter.m5 m5Var = this.f202231a;
        m5Var.getClass();
        de5.a.f229396a.k(14, 8, 9);
        new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, com.tencent.mm.ui.chatting.presenter.e5.f202203d, new com.tencent.mm.ui.chatting.presenter.f5(m5Var, item), null);
    }
}
