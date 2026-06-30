package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.player.base.i f150659d;

    public f(com.tencent.mm.plugin.music.player.base.i iVar) {
        this.f150659d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.music.player.base.i iVar = this.f150659d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BasePlayer", "onStart %b", java.lang.Boolean.valueOf(iVar.e()));
        com.tencent.mm.plugin.music.player.base.n nVar = iVar.f150663a;
        b21.r rVar = iVar.f150664b;
        rl3.l lVar = (rl3.l) nVar;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "setEvents, onStart");
        lVar.f397261b.q(rVar);
    }
}
