package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f140467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.silent_download.c0 f140468e;

    public w(com.tencent.mm.plugin.game.model.silent_download.c0 c0Var, long j17) {
        this.f140468e = c0Var;
        this.f140467d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloader", "gamelog.download, scheduleDownload, delay timer: %d", java.lang.Long.valueOf(this.f140467d));
        this.f140468e.b(false);
    }
}
