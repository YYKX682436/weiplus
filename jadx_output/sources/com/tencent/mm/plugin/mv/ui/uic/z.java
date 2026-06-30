package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class z implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c0 f151559d;

    public z(com.tencent.mm.plugin.mv.ui.uic.c0 c0Var) {
        this.f151559d = c0Var;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        pm3.a state = (pm3.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar == null || !(dVar instanceof pm3.d)) {
            return;
        }
        pm3.d dVar2 = (pm3.d) dVar;
        int ordinal = dVar2.f356875b.ordinal();
        com.tencent.mm.plugin.mv.ui.uic.c0 c0Var = this.f151559d;
        im3.j jVar = dVar2.f356876c;
        if (ordinal == 0 || ordinal == 1) {
            com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList = c0Var.f151069g;
            if (musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList != null) {
                musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList.z(new com.tencent.mm.plugin.mv.ui.uic.y(jVar));
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (!jVar.f292702h) {
            com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList2 = c0Var.f151069g;
            if (musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList2 != null) {
                musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList2.u(jVar);
                return;
            }
            return;
        }
        im3.j jVar2 = (im3.j) jVar.y0();
        jVar2.f292699e = 0;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList3 = c0Var.f151069g;
        if (musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList3 != null) {
            musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList3.y(jVar2, true);
        }
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList4 = c0Var.f151069g;
        if (musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList4 != null) {
            musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList4.z(new com.tencent.mm.plugin.mv.ui.uic.x(jVar));
        }
    }
}
