package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class j implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q f151212d;

    public j(com.tencent.mm.plugin.mv.ui.uic.q qVar) {
        this.f151212d = qVar;
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
        com.tencent.mm.plugin.mv.ui.uic.q qVar = this.f151212d;
        im3.j jVar = dVar2.f356876c;
        if (ordinal == 0) {
            qVar.P6().setChecked(jVar.f292702h);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        qVar.P6().setChecked(jVar.f292702h);
        im3.g gVar = qVar.f151365h;
        java.lang.String str = jVar.f292701g;
        if (gVar != null) {
            gVar.f292691e = str;
        }
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList = qVar.f151366i;
        if (musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.r(musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList, null, 1, null);
        }
        r45.oc5 oc5Var = state.f356868e;
        if (oc5Var != null) {
            com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList2 = qVar.f151366i;
            xm3.n0 n0Var = musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList2 != null ? musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList2.f152058e : null;
            if (n0Var == null) {
                return;
            }
            n0Var.d(com.tencent.mm.plugin.mv.ui.uic.q.O6(qVar, oc5Var, str, jVar.f292698d));
        }
    }
}
