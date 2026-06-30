package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class l implements com.tencent.mm.plugin.downloader.model.i1 {
    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadCallback", "onTaskFailed, errCode:%d", java.lang.Integer.valueOf(i17));
        if (i17 != 104) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 == null || !c17.field_autoDownload) {
                return;
            }
            com.tencent.mm.plugin.game.model.silent_download.u.c(c17.field_appId, 1, i17);
            n(c17.field_appId);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadCallback", "onTaskFinished");
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || !c17.field_autoDownload) {
            return;
        }
        com.tencent.mm.plugin.game.model.silent_download.u.c(c17.field_appId, 0, 0);
        n(c17.field_appId);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        o("onTaskResumed", j17, true);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        o("onTaskPaused", j17, false);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        o("onTaskStarted", j17, true);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadCallback", "onTaskRemoved");
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || !c17.field_autoDownload) {
            return;
        }
        com.tencent.mm.plugin.game.model.silent_download.u.c(c17.field_appId, 2, 0);
        n(c17.field_appId);
    }

    public final void n(java.lang.String str) {
        com.tencent.mm.plugin.game.model.silent_download.n nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
        nVar.field_appId = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadCallback", "removeSilentDownloadTask, appid:%s, ret:%b", str, java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().delete(nVar, new java.lang.String[0])));
    }

    public final void o(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.game.model.silent_download.n y07;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadCallback", str);
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null && android.text.TextUtils.equals(str, "onTaskStarted") && (y07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().y0(c17.field_appId)) != null) {
            jj0.a.a().b(12, y07.field_appId, "ok", 0L);
        }
        if (c17 == null || !c17.field_autoDownload) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadCallback", "%s. appid:%s, ret:%b", str, c17.field_appId, java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().L0(c17.field_appId, z17)));
    }
}
