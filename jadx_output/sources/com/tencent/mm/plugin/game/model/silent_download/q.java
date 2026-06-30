package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {
    public q(com.tencent.mm.plugin.game.model.silent_download.r rVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.tencent.mm.plugin.game.model.silent_download.s.class) {
            if (gm0.j1.a() && !gm0.m.r()) {
                int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (netType == com.tencent.mm.plugin.game.model.silent_download.s.f140459f) {
                    return;
                }
                com.tencent.mm.plugin.game.model.silent_download.s.f140459f = netType;
                if (netType == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "netStateChange, netState = %s, checkDownload", java.lang.Integer.valueOf(netType));
                    m43.c.b().a("game_silent_download", new com.tencent.mm.plugin.game.model.silent_download.x(com.tencent.mm.plugin.game.model.silent_download.b0.f140446a, false));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "netStateChange, netState = %s, pauseDownload", java.lang.Integer.valueOf(netType));
                    com.tencent.mm.plugin.game.model.silent_download.b0.f140446a.c();
                }
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.r0.i().u();
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.GameSilentDownloadListener", "acc has not ready");
        }
    }
}
