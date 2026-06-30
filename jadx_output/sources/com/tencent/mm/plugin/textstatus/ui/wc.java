package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes2.dex */
public final class wc implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.xc f174410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f174411e;

    public wc(com.tencent.mm.plugin.textstatus.ui.xc xcVar, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f174410d = xcVar;
        this.f174411e = wxRecyclerAdapter;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 netSceneBase) {
        pj4.k1 k1Var;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        kotlin.jvm.internal.o.g(netSceneBase, "netSceneBase");
        com.tencent.mm.plugin.textstatus.ui.xc xcVar = this.f174410d;
        if (i17 == 0 && i18 == 0 && (k1Var = ((ej4.g) netSceneBase).f253359f) != null) {
            xcVar.f174435e = k1Var.f355156e;
            xcVar.f174436f = k1Var.f355157f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = k1Var.f355155d;
            arrayList.addAll(linkedList);
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new com.tencent.mm.plugin.textstatus.ui.vc());
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                wxRecyclerAdapter = this.f174411e;
                if (!hasNext) {
                    break;
                }
                java.lang.Object next = it.next();
                if (next instanceof pj4.b2) {
                    wxRecyclerAdapter.getData().add(new kj4.b(xcVar.f174432b, (pj4.b2) next));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "HistoryItemLoader: onSceneEnd likedSize=" + linkedList.size());
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        xcVar.f174433c.N(0);
    }
}
