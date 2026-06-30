package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class h2 implements com.tencent.mm.ui.chatting.adapter.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.l2 f202247a;

    public h2(com.tencent.mm.ui.chatting.presenter.l2 l2Var) {
        this.f202247a = l2Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void a(android.view.View v17, int i17, com.tencent.mm.ui.chatting.adapter.f0 inputItem) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(inputItem, "inputItem");
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.ui.chatting.presenter.l2 l2Var = this.f202247a;
        com.tencent.mm.storage.f9 n17 = e0Var.n(l2Var.f202542e, ((com.tencent.mm.ui.chatting.presenter.a2) inputItem).f198411d);
        l2Var.getClass();
        de5.a.f229396a.k(5, 9, 10);
        o15.b bVar = new o15.b();
        java.lang.String j17 = n17.j();
        if (j17 == null) {
            j17 = "";
        }
        bVar.fromXml(j17);
        o15.a j18 = bVar.j();
        if (j18 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("map_view_type", 1);
            intent.putExtra("kwebmap_slat", j18.u());
            intent.putExtra("kwebmap_lng", j18.w());
            intent.putExtra("kPoiid", j18.r());
            intent.putExtra("kPoiName", j18.s());
            intent.putExtra("Kwebmap_locaion", j18.l());
            intent.putExtra("kShowshare", false);
            intent.putExtra("key_is_forward_preview", true);
            j45.l.j(v17.getContext(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        }
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void b(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.chatting.presenter.l2 l2Var = this.f202247a;
        l2Var.getClass();
        de5.a.f229396a.k(14, 9, 10);
        new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, com.tencent.mm.ui.chatting.presenter.f2.f202210d, new com.tencent.mm.ui.chatting.presenter.g2(l2Var, item), null);
    }
}
