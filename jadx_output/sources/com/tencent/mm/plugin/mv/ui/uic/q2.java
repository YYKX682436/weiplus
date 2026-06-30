package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q2 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC f151378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151380c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f151381d;

    public q2(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC, fm3.u uVar, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, com.tencent.mm.plugin.mv.ui.uic.n0 n0Var) {
        this.f151378a = musicMvSongInfoUIC;
        this.f151379b = uVar;
        this.f151380c = musicMvMainUIC;
        this.f151381d = n0Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        fm3.u uVar;
        int i17 = z17 ? 3 : 1;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC = this.f151378a;
        r45.hf2 hf2Var = musicMvSongInfoUIC.f150999d;
        if (hf2Var == null || (uVar = this.f151379b) == null) {
            return;
        }
        int i18 = musicMvSongInfoUIC.f151002g ? 1 : 2;
        fm3.j0 j0Var = fm3.j0.f264078a;
        android.app.Activity context = this.f151380c.getContext();
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = this.f151381d;
        j0Var.f(context, hf2Var, uVar, 4, i17, 6, i18, n0Var.Q6(), n0Var.O6(), n0Var.P6(), n0Var.E);
    }
}
