package s65;

/* loaded from: classes11.dex */
public class v0 implements q65.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s65.x0 f403524a;

    public v0(s65.x0 x0Var) {
        this.f403524a = x0Var;
    }

    @Override // q65.b
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "total=%d, offset=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        s65.x0 x0Var = this.f403524a;
        if (x0Var.f403544r != 2) {
            s65.x0.j(x0Var, i18, i17);
        }
        x0Var.a(i17, i18);
    }

    @Override // q65.a
    public void b(long j17) {
        s65.m0 m0Var = this.f403524a.C;
        m0Var.f403494a.post(new s65.k0(m0Var, j17));
    }

    @Override // q65.a
    public void c(long j17) {
        s65.m0 m0Var = this.f403524a.C;
        m0Var.f403494a.post(new s65.l0(m0Var, j17));
    }

    @Override // q65.b
    public void d(int i17, int i18, r45.js5 js5Var) {
        s65.x0 x0Var = this.f403524a;
        x0Var.f403550x = false;
        x0Var.C.b();
        x0Var.B = java.lang.System.currentTimeMillis();
        com.tencent.mm.sandbox.monitor.l lVar = x0Var.f403527a;
        if (lVar == null) {
            x0Var.l(2, true);
            return;
        }
        android.content.Context context = x0Var.A;
        if (i17 == 200 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "packCallback onSceneEnd ok");
            if (x0Var.f403544r != 2) {
                s65.x0.j(x0Var, 100, 100);
            }
            if (x0Var.f403542p) {
                s65.o0.h(context, 0);
            } else {
                s65.o0.h(context, 9);
            }
            java.lang.String string = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "yyb_pkg_sig_prefs", 4)).getString(com.tencent.mm.sdk.platformtools.x2.f193072b, "");
            x0Var.f403537k = string;
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess onSceneEnd sig[%s], path[%s]", string, x0Var.f403527a.b());
            if (com.tencent.mm.sdk.platformtools.t8.K0(x0Var.f403537k)) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(322L, 8L, 1L, false);
                g0Var.d(11098, java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED));
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    java.lang.String i19 = com.tencent.mm.vfs.w6.i(x0Var.f403527a.b(), true);
                    if (!com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName().equalsIgnoreCase(com.tencent.mm.sdk.platformtools.x2.f193072b) || j62.e.g().a("clicfg_appcompat_pkg_sig", "0", false, true).equals("1")) {
                        uk.f.d(new java.io.File(i19), x0Var.f403537k);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "Skip writing apkSig for v2 signing, pkg = " + com.tencent.mm.sdk.platformtools.x2.f193072b);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode done");
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var2.idkeyStat(322L, 6L, 1L, false);
                    g0Var2.d(11098, java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY), x0Var.f403537k);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode e: " + e17.getMessage());
                    com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var3.idkeyStat(322L, 7L, 1L, false);
                    g0Var3.d(11098, java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.UNKNOWN_CAPABILITY), e17.getMessage());
                }
            }
            int i27 = x0Var.f403544r;
            if (i27 == 1) {
                s65.o0.g(context, 8, 0);
                s65.o0.d(x0Var.f403536j, x0Var.f403537k, x0Var.f403535i, x0Var.f403538l, x0Var.f403544r, x0Var.f403530d, x0Var.f403546t);
                x0Var.c(x0Var.f403527a.b());
                if (x0Var.f403547u) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 58L, 1L, false);
                }
            } else if (i27 == 0) {
                x0Var.c(x0Var.f403527a.b());
            } else if (i27 == 2) {
                s65.o0.g(context, 1, 0);
                s65.o0.d(x0Var.f403536j, x0Var.f403537k, x0Var.f403535i, x0Var.f403538l, x0Var.f403544r, x0Var.f403530d, x0Var.f403546t);
            }
            s65.o0.f();
            return;
        }
        if (i18 == -13) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdaterManager", "session timeout, killself and restart");
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "UpdaterService stopInstance()");
            com.tencent.mm.sandbox.updater.UpdaterService updaterService = com.tencent.mm.sandbox.updater.UpdaterService.f192331p;
            if (updaterService != null) {
                updaterService.i();
            }
            com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = com.tencent.mm.sandbox.updater.AppUpdaterUI.f192316m;
            if (appUpdaterUI != null) {
                appUpdaterUI.R6();
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4);
            o4Var.getClass();
            o4Var.putBoolean("update_download_start_one_immediate", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "putOneDownloadTask");
            return;
        }
        if (!(lVar instanceof s65.g0) || x0Var.f403530d == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdaterManager", "update failed");
            s65.o0.h(context, 10);
            int i28 = x0Var.f403544r;
            if (i28 == 1) {
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490378tb);
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/"));
                intent.addFlags(268435456);
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(134217728));
                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                k0Var.m(null);
                k0Var.D.when = java.lang.System.currentTimeMillis();
                k0Var.f(string2);
                k0Var.e(null);
                k0Var.f469463g = activity;
                android.app.Notification b17 = k0Var.b();
                x0Var.f403552z = b17;
                b17.icon = com.tencent.mm.R.drawable.boa;
                b17.flags |= 16;
                ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, x0Var.f403552z);
            } else if (i28 == 0) {
                x0Var.l(1, true);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdaterManager", "download package from cdn error.");
            if (x0Var.f403542p) {
                if (i17 == 3 || i17 == 4 || i17 == 2 || i17 == 1 || i17 == 13) {
                    s65.o0.h(context, i17);
                }
                x0Var.f403542p = false;
                int i29 = x0Var.f403544r;
                if (i29 == 1) {
                    if (!x0Var.f403547u) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.UpdaterManager", "showDownloadFullPackNotification()");
                        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f490379tc, com.tencent.mm.sdk.platformtools.t8.f0(x0Var.f403538l));
                        android.content.Intent intent2 = x0Var.f403551y;
                        intent2.putExtra("intent_extra_force_download_full", true);
                        android.app.PendingIntent service = android.app.PendingIntent.getService(context, 0, intent2, fp.g0.a(134217728));
                        z2.k0 k0Var2 = new z2.k0(context, "reminder_channel_id");
                        k0Var2.m(null);
                        k0Var2.D.when = java.lang.System.currentTimeMillis();
                        k0Var2.f(string3);
                        k0Var2.e(null);
                        k0Var2.f469463g = service;
                        android.app.Notification b18 = k0Var2.b();
                        x0Var.f403552z = b18;
                        b18.icon = com.tencent.mm.R.drawable.boa;
                        b18.flags |= 16;
                        ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, x0Var.f403552z);
                    } else if (i17 == 1) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 51L, 1L, false);
                    } else if (i17 == 2) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 54L, 1L, false);
                    } else if (i17 == 3) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 52L, 1L, false);
                    } else if (i17 == 4) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 53L, 1L, false);
                    } else if (i17 == 13) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 55L, 1L, false);
                    }
                } else if (i29 == 0) {
                    x0Var.l(1, true);
                } else if (i29 == 2) {
                    x0Var.n();
                }
            } else {
                x0Var.f403527a = new s65.z(x0Var.f403538l, x0Var.f403536j, x0Var.f403530d, x0Var.f403534h, x0Var.f403531e, x0Var.f403532f, x0Var.f403533g, x0Var.f403529c, x0Var.f403544r == 2);
                x0Var.r();
            }
        }
        x0Var.h(x0Var.f403527a);
    }
}
