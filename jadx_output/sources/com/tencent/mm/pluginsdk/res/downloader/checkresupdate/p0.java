package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes5.dex */
public abstract class p0 {
    public static void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "doCheck %s", java.lang.Integer.valueOf(i17));
        gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k0());
        if (gm0.j1.b().m()) {
            long c17 = c01.id.c();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_RES_DOWNLOADER_CHECK_RES_LAST_CHECK_TIME_LONG, java.lang.Long.valueOf(c17));
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "refreshCheckTime %s %s", java.lang.Long.valueOf(c17), k35.m1.e(c17));
        }
    }

    public static void b() {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            v65.b bVar = new v65.b("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", c01.id.c(), com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RES_DOWNLOADER_CHECK_RES_LAST_CHECK_TIME_LONG, null), 0L), ((java.lang.Math.abs(gm0.j1.b().h() % 2) * 3600) + 86400) * 1000);
            try {
                java.lang.String e17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().e(new com.tencent.mm.repairer.config.global.RepairerConfigCheckResUpdateTimeInterval());
                if (!e17.isEmpty()) {
                    java.lang.String[] split = e17.split(";");
                    if (split.length > 0) {
                        for (java.lang.String str : split) {
                            bVar.a(str);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "apply exptConfigStr %s", e17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", th6, "run", new java.lang.Object[0]);
            }
            if (bVar.b()) {
                a(0);
            }
        }
    }
}
