package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f150661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.player.base.i f150662e;

    public h(com.tencent.mm.plugin.music.player.base.i iVar, boolean z17) {
        this.f150662e = iVar;
        this.f150661d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f150661d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BasePlayer", "onStop, isComplete:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.music.player.base.i iVar = this.f150662e;
        com.tencent.mm.plugin.music.player.base.n nVar = iVar.f150663a;
        b21.r rVar = iVar.f150664b;
        rl3.l lVar = (rl3.l) nVar;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "setEvents, onStop");
        b21.r j17 = kl3.t.g().j();
        if (j17 == null) {
            return;
        }
        boolean a17 = j17.a(rVar);
        rl3.p pVar = lVar.f397261b;
        if (a17) {
            pVar.stopPlay();
        }
        pVar.r(pVar.f397265k);
        if (z17) {
            pVar.l(pVar.f397265k);
        }
    }
}
