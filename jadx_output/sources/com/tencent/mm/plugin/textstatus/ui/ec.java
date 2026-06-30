package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes2.dex */
public final class ec implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.fc f173846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f173847e;

    public ec(com.tencent.mm.plugin.textstatus.ui.fc fcVar, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f173846d = fcVar;
        this.f173847e = wxRecyclerAdapter;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 netSceneBase) {
        pj4.k1 k1Var;
        kotlin.jvm.internal.o.g(netSceneBase, "netSceneBase");
        com.tencent.mm.plugin.textstatus.ui.fc fcVar = this.f173846d;
        if (i17 == 0 && i18 == 0 && (k1Var = ((ej4.g) netSceneBase).f253359f) != null) {
            fcVar.f173878d = k1Var.f355156e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(k1Var.f355155d);
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new com.tencent.mm.plugin.textstatus.ui.dc());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadNextPage: callback dataList size=");
            sb6.append(arrayList.size());
            sb6.append(", old size=");
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f173847e;
            sb6.append(wxRecyclerAdapter.getData().size());
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", sb6.toString());
            wxRecyclerAdapter.getData().clear();
            for (java.lang.Object obj : arrayList) {
                if (obj instanceof pj4.b2) {
                    wxRecyclerAdapter.getData().add(new kj4.b(fcVar.f173875a, (pj4.b2) obj));
                }
            }
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = fcVar.f173876b;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.N(0);
        }
    }
}
