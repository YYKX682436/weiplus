package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f150657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.player.base.i f150658e;

    public e(com.tencent.mm.plugin.music.player.base.i iVar, boolean z17) {
        this.f150658e = iVar;
        this.f150657d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f150657d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BasePlayer", "onError, needRetry:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.music.player.base.i iVar = this.f150658e;
        com.tencent.mm.plugin.music.player.base.n nVar = iVar.f150663a;
        b21.r rVar = iVar.f150664b;
        rl3.l lVar = (rl3.l) nVar;
        lVar.getClass();
        b21.r j17 = kl3.t.g().j();
        if (j17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "onError, needRetry:%b", java.lang.Boolean.valueOf(z17));
        rl3.p pVar = lVar.f397261b;
        if (z17) {
            rl3.p.w(pVar, rVar, 20);
        } else {
            rl3.p.w(pVar, rVar, 21);
        }
        if (!j17.a(rVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "send stop event");
            pVar.r(pVar.f397265k);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "stop");
        pVar.stopPlay();
        if (!z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new rl3.k(lVar));
            pVar.r(pVar.f397265k);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "retry system media player again");
        pVar.y(j17, true);
        jl3.d dVar = new jl3.d(rVar, gl3.e.b(rVar.f17346e));
        pVar.f397267m = dVar;
        dVar.f300221q = pVar.f397271q;
        if (dVar.f300217m) {
            dVar.f300217m = false;
            s75.d.b(dVar, "music_download_thread");
        }
        kl3.h hVar = pVar.f397229d;
        if (hVar != null) {
            ((pl3.e) hVar).f356705c.f356697j = pVar.f397267m;
        }
    }
}
