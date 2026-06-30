package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f151340e;

    public o2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, boolean z17) {
        this.f151339d = musicMvMainUIC;
        this.f151340e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fm3.u uVar;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151339d;
        pk4.c cVar = musicMvMainUIC.f150983p;
        if (cVar != null) {
            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).f();
        }
        musicMvMainUIC.T6().notifyItemRangeChanged(musicMvMainUIC.f150982o, 1, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.f150973J);
        if (!kl3.t.g().a().i()) {
            if (musicMvMainUIC.f150985r || this.f151340e) {
                musicMvMainUIC.c7(musicMvMainUIC.f150982o);
                lm3.e eVar = (lm3.e) kz5.n0.a0(musicMvMainUIC.f150977g, musicMvMainUIC.f150982o);
                if (eVar != null && (uVar = eVar.f319482d) != null) {
                    uVar.f264143w = 0L;
                    uVar.f264144x = 0L;
                }
                if (!b21.m.c()) {
                    android.content.Intent intent = musicMvMainUIC.getActivity().getIntent();
                    if (intent != null ? intent.getBooleanExtra("key_music_stop_or_complete", false) : false) {
                        b21.m.i(b21.m.b());
                    } else {
                        b21.m.g();
                    }
                }
            } else {
                pk4.c cVar2 = musicMvMainUIC.f150983p;
                if (cVar2 != null) {
                    cVar2.setPauseOnVideoPlay(true);
                }
            }
        }
        musicMvMainUIC.f150985r = false;
    }
}
