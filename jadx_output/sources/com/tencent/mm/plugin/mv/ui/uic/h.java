package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class h implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q f151154d;

    public h(com.tencent.mm.plugin.mv.ui.uic.q qVar) {
        this.f151154d = qVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.mvvmlist.MvvmList, com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList] */
    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        androidx.lifecycle.g0 g0Var;
        pm3.a state = (pm3.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar == null || !(dVar instanceof pm3.b)) {
            return;
        }
        r45.oc5 oc5Var = ((pm3.b) dVar).f356870b;
        im3.g gVar = new im3.g(oc5Var);
        final com.tencent.mm.plugin.mv.ui.uic.q qVar = this.f151154d;
        qVar.f151365h = gVar;
        gVar.f292691e = oc5Var.f382151f;
        ?? r17 = new com.tencent.mm.plugin.mvvmlist.MvvmList<im3.j>(qVar, gVar, new xm3.n0()) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(gVar, config, qVar.getActivity(), null, null, 24, null);
                kotlin.jvm.internal.o.g(gVar, "dataSource");
                kotlin.jvm.internal.o.g(config, "config");
            }

            @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
            public java.lang.String c() {
                return "MicroMsg.Mv.MusicMvAlbumPreviewRecyclerUIC";
            }
        };
        qVar.f151366i = r17;
        qVar.f151367m = new xm3.t0(r17, new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != 1 ? type != 3 ? new im3.f(com.tencent.mm.plugin.mv.ui.uic.q.this.Q6()) : new im3.i(com.tencent.mm.plugin.mv.ui.uic.q.this.Q6()) : new im3.a();
            }
        }, false);
        qVar.getRecyclerView().setAdapter(qVar.f151367m);
        qVar.getRecyclerView().setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) qVar.f151362e).getValue());
        ((com.tencent.mm.plugin.mv.ui.view.i) ((jz5.n) qVar.f151363f).getValue()).b(qVar.getRecyclerView());
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList = qVar.f151366i;
        if (musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList == null || (g0Var = musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList.f152071u) == null) {
            return;
        }
        g0Var.observe(qVar.getActivity(), new com.tencent.mm.plugin.mv.ui.uic.g(qVar, dVar));
    }
}
