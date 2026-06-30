package xz4;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {
    public o(xz4.p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (xz4.q.class) {
            if (gm0.j1.a() && !gm0.m.r()) {
                int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (netType == xz4.q.f458296b) {
                    return;
                }
                xz4.q.f458296b = netType;
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "onNetStateChange, netState = " + netType);
                if (netType == 0) {
                    boolean a17 = com.tencent.mm.plugin.game.commlib.i.a();
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WEPKG_CHECK_DOWNLOAD_TIME_LONG;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) > 1800;
                    if (!z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "dont auto download in wifi, because from the last time is not enough for %s s", 1800L);
                    }
                    if (!a17 && z17) {
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                        com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
                        wepkgNotifyEvent.f54992g.f7969a = 0;
                        wepkgNotifyEvent.e();
                    }
                } else {
                    xz4.d.a().b();
                }
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgAutoDownloader", "acc has not ready");
        }
    }
}
