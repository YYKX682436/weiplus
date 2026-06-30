package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q f151135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.d f151136e;

    public g(com.tencent.mm.plugin.mv.ui.uic.q qVar, j75.d dVar) {
        this.f151135d = qVar;
        this.f151136e = dVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        androidx.lifecycle.g0 g0Var;
        ym3.o oVar = (ym3.o) obj;
        if ((oVar != null ? oVar.f463177a : null) == ym3.p.f463181f) {
            com.tencent.mm.plugin.mv.ui.uic.q qVar = this.f151135d;
            qVar.getRecyclerView().post(new com.tencent.mm.plugin.mv.ui.uic.f(qVar, this.f151136e));
            com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList = qVar.f151366i;
            if (musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList == null || (g0Var = musicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList.f152071u) == null) {
                return;
            }
            g0Var.removeObserver(this);
        }
    }
}
