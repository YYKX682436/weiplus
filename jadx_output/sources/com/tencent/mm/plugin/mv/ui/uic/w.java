package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c0 f151507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.b f151508e;

    public w(com.tencent.mm.plugin.mv.ui.uic.c0 c0Var, com.tencent.mm.plugin.mv.ui.uic.b bVar) {
        this.f151507d = c0Var;
        this.f151508e = bVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.tencent.mm.plugin.mvvmlist.MvvmList, com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList] */
    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        r45.oc5 oc5Var;
        pm3.a state = (pm3.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (!(state.f298066d instanceof pm3.b) || (oc5Var = state.f356868e) == null) {
            return;
        }
        im3.k kVar = new im3.k(oc5Var);
        com.tencent.mm.plugin.mv.ui.uic.c0 c0Var = this.f151507d;
        c0Var.getClass();
        ?? r47 = new com.tencent.mm.plugin.mvvmlist.MvvmList<im3.j>(c0Var, kVar, new xm3.n0()) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(kVar, config, c0Var.getActivity(), null, null, 24, null);
                kotlin.jvm.internal.o.g(kVar, "dataSource");
                kotlin.jvm.internal.o.g(config, "config");
            }

            @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
            public java.lang.String c() {
                return "MicroMsg.Mv.MusicMvAlbumPreviewSelectedUIC";
            }
        };
        c0Var.f151069g = r47;
        androidx.lifecycle.g0 g0Var = r47.f152071u;
        if (g0Var != null) {
            g0Var.observe(c0Var.getActivity(), new com.tencent.mm.plugin.mv.ui.uic.u(c0Var));
        }
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList = c0Var.f151069g;
        if (musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList != null) {
            c0Var.f151070h = new xm3.t0(musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList, new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$buildItemConvertFactory$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new im3.l();
                }
            }, false);
        }
        com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var).setAdapter(c0Var.f151070h);
        com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var).setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) c0Var.f151068f).getValue());
        com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var).N(new com.tencent.mm.plugin.mv.ui.uic.r(c0Var));
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 10);
        android.view.View view = new android.view.View(c0Var.getActivity());
        view.setPadding(b17, 0, 0, 0);
        xm3.t0 t0Var = c0Var.f151070h;
        if (t0Var != null) {
            in5.n0.U(t0Var, view, view.hashCode(), false, 4, null);
        }
        android.view.View view2 = new android.view.View(c0Var.getActivity());
        view2.setPadding(b17, 0, 0, 0);
        xm3.t0 t0Var2 = c0Var.f151070h;
        if (t0Var2 != null) {
            in5.n0.P(t0Var2, view2, view2.hashCode(), false, 4, null);
        }
        xm3.t0 t0Var3 = c0Var.f151070h;
        if (t0Var3 != null) {
            t0Var3.f293105o = new com.tencent.mm.plugin.mv.ui.uic.v(this.f151508e);
        }
        if (oc5Var.f382150e.size() > 0) {
            com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var).setVisibility(0);
            c0Var.P6().setEnabled(true);
        } else {
            com.tencent.mm.plugin.mv.ui.uic.c0.O6(c0Var).setVisibility(8);
            c0Var.P6().setEnabled(false);
        }
    }
}
