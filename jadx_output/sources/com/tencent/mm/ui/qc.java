package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class qc {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f209549a;

    public static boolean a(android.app.Activity activity) {
        com.tencent.mm.pluginsdk.model.app.b c17 = com.tencent.mm.pluginsdk.model.app.b.c();
        if (c17 != null) {
            c17.b();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMErrorProcessor", "alpha download in silence.");
            return true;
        }
        if (i95.n0.c(mi3.f.class) == null) {
            return false;
        }
        ((com.tencent.mm.plugin.sandbox.SubCoreSandBox) ((mi3.f) i95.n0.c(mi3.f.class))).getClass();
        int i17 = com.tencent.mm.sandbox.updater.Updater.f192322o;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", com.tencent.mm.sdk.platformtools.t8.i1()).commit();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(34);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 50L, 1L, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "updater silence");
        com.tencent.mm.sandbox.updater.Updater updater = new com.tencent.mm.sandbox.updater.Updater(activity);
        updater.c();
        updater.f192327h = true;
        updater.f(2);
        return true;
    }

    public static boolean b(android.app.Activity activity, int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.w("MicroMsg.MMErrorProcessor", "updateRequired [%d,%d] current version:%d  channel:%d updateMode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192438a));
        if (i17 != 4) {
            return false;
        }
        if (i18 != -17) {
            if (i18 != -16 || i95.n0.c(mi3.f.class) == null) {
                return false;
            }
            mi3.e Ai = ((com.tencent.mm.plugin.sandbox.SubCoreSandBox) ((mi3.f) i95.n0.c(mi3.f.class))).Ai(activity, com.tencent.mm.R.string.k3j, new com.tencent.mm.ui.nc(activity), false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 36L, 1L, true);
            ((com.tencent.mm.sandbox.updater.Updater) Ai).f(1);
            return true;
        }
        long j17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getLong("recomended_update_ignore", -1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMErrorProcessor", "updateRequired last:%d  now:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.H1(j17)));
        if ((j17 != -1 && com.tencent.mm.sdk.platformtools.t8.H1(j17) < 86400) || (com.tencent.mm.sdk.platformtools.a0.f192438a & 2) != 0) {
            return true;
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi");
        boolean z17 = ((((java.lang.Integer) c01.d9.b().p().l(7, 0)).intValue() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0) && (com.tencent.mm.sdk.platformtools.t8.K0(d17) || com.tencent.mm.sdk.platformtools.t8.D1(d17, 0) == 0);
        if ((com.tencent.mm.sdk.platformtools.a0.f192438a & 1) != 0) {
            z17 = false;
        }
        com.tencent.mm.sdk.platformtools.t8.D1(d17, 0);
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 40L, 1L, true);
            return a(activity);
        }
        if (i95.n0.c(mi3.f.class) == null) {
            return false;
        }
        mi3.e Ai2 = ((com.tencent.mm.plugin.sandbox.SubCoreSandBox) ((mi3.f) i95.n0.c(mi3.f.class))).Ai(activity, com.tencent.mm.R.string.k3k, new com.tencent.mm.ui.cc(intent, activity), true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 38L, 1L, true);
        ((com.tencent.mm.sandbox.updater.Updater) Ai2).f(2);
        return true;
    }
}
