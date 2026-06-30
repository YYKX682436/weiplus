package wn4;

/* loaded from: classes11.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final wn4.x f447571a = new wn4.x();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f447572b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f447573c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f447574d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static wn4.f f447575e;

    public static final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService).cancel(8341);
    }

    public static final void h(com.tencent.mm.plugin.hp.util.TinkerSyncResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        b();
        jx3.f.INSTANCE.idkeyStat(1429L, 23L, 1L, false);
        ((ku5.t0) ku5.t0.f312615d).B(new wn4.s(response));
    }

    public static final void i(java.lang.String title, java.lang.String text, android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "showNotification, title = %s, text = %s", title, text);
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(null);
        k0Var.h(16, true);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(title);
        k0Var.e(text);
        k0Var.f469463g = pendingIntent;
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        android.app.Notification b17 = k0Var.b();
        kotlin.jvm.internal.o.f(b17, "build(...)");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService).notify(8341, b17);
    }

    public final void a(java.lang.String str, com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        boolean z17 = false;
        java.io.File file = new java.io.File(com.tencent.mm.vfs.w6.i(str, false));
        try {
            z17 = new com.tencent.tinker.loader.shareutil.ShareSecurityCheck(ak0.o.f5543b).verifyPatchMetaSignature(file);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Updater.ManualUpdaterProcessor", e17, "verifyPatchMetaSignature", new java.lang.Object[0]);
        }
        if (!z17) {
            j();
            jx3.f.INSTANCE.idkeyStat(1429L, 17L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "hot patch verfiy signature error");
            return;
        }
        if (!com.tencent.mm.app.m2.f53515a.a()) {
            j();
            jx3.f.INSTANCE.idkeyStat(1429L, 20L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "patch applying is blocked by TinkerEnsuranceOnFault, update basepack with different clientversion to recover.");
            return;
        }
        ak0.e a17 = ak0.g.a(file);
        if (a17 != null) {
            java.lang.String property = ((ak0.f) a17).f5537a.getProperty("patch.client.ver");
            if (android.text.TextUtils.isEmpty(property)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "Fail to get patch clientversion.");
            } else {
                b83.e eVar = new b83.e(lp0.a.f320249c, property);
                eVar.f(eVar.a(2));
            }
        }
        com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.f142404b = new wn4.g(tinkerSyncResponse);
        int d17 = ak0.n.d(file);
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "start to run patch. ret = " + d17);
        if (d17 == 0 || d17 == 1) {
            jx3.f.INSTANCE.idkeyStat(1429L, 22L, 1L, false);
        } else if (d17 != 2) {
            j();
            jx3.f.INSTANCE.idkeyStat(1429L, 21L, 1L, false);
        } else {
            h(tinkerSyncResponse);
            jx3.f.INSTANCE.idkeyStat(1429L, 30L, 1L, false);
        }
    }

    public final boolean c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "HdiffApk checkAndShowInstallPatchDialog, newApkMd5 = " + str);
        java.lang.String l17 = c83.e.l(str);
        if (!com.tencent.mm.vfs.w6.j(l17) || !uk.b.a(l17) || !c83.e.n(l17)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "checkAndShowInstallPatchDialog apk ready " + l17);
        com.tencent.mm.pluginsdk.model.app.n1.d(com.tencent.mm.sdk.platformtools.x2.f193071a, l17, null, false);
        jx3.f.INSTANCE.idkeyStat(1429L, 5L, 1L, false);
        return true;
    }

    public final void d(com.tencent.mm.vfs.r6 patchFile, long j17, com.tencent.mm.plugin.hp.util.TinkerSyncResponse response) {
        kotlin.jvm.internal.o.g(patchFile, "patchFile");
        kotlin.jvm.internal.o.g(response, "response");
        java.lang.String str = (java.lang.String) f447574d.get(java.lang.Long.valueOf(j17));
        if (str != null) {
            java.util.HashMap hashMap = f447573c;
            if (hashMap.get(str) != null) {
                java.lang.Object obj = hashMap.get(str);
                kotlin.jvm.internal.o.d(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return;
                }
            }
        }
        kotlin.jvm.internal.m0.c(f447573c).remove(str);
        jx3.f.INSTANCE.idkeyStat(1429L, 8L, 1L, false);
        ((ku5.t0) ku5.t0.f312615d).h(new wn4.k(response, patchFile), "Updater");
    }

    public final java.lang.String e(int i17) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void f(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        boolean c17;
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "prepare to download fileMd5:" + tinkerSyncResponse.f142413i + " fileSize:" + tinkerSyncResponse.f142415n + " cdnUrl:" + tinkerSyncResponse.f142412h);
        if (!kotlin.jvm.internal.o.b(fp.m.c(), "mounted")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "no sdcard.");
            jx3.f.INSTANCE.idkeyStat(1429L, 9L, 1L, false);
            java.lang.Integer packageType = tinkerSyncResponse.f142410f;
            kotlin.jvm.internal.o.f(packageType, "packageType");
            w73.f.i(10, packageType.intValue(), 103);
            return;
        }
        java.lang.Integer num = tinkerSyncResponse.f142410f;
        if (num != null && num.intValue() == 4) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a));
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            c17 = fp.i.c(((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L) * 4);
        } else {
            c17 = fp.i.c(tinkerSyncResponse.f142415n);
        }
        if (!c17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "sdcard is full.");
            ((ku5.t0) ku5.t0.f312615d).B(wn4.p.f447560d);
            jx3.f.INSTANCE.idkeyStat(1429L, 10L, 1L, false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 55L, 1L, false);
            java.lang.Integer packageType2 = tinkerSyncResponse.f142410f;
            kotlin.jvm.internal.o.f(packageType2, "packageType");
            w73.f.i(10, packageType2.intValue(), 104);
            return;
        }
        c83.e.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        ((ku5.t0) ku5.t0.f312615d).g(new c83.d());
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97150a = tinkerSyncResponse.f142412h;
        t0Var.f97153d = tinkerSyncResponse.f142414m;
        t0Var.f97154e = tinkerSyncResponse.f142413i;
        t0Var.f97158i = false;
        t0Var.f97160k = true;
        t0Var.f97174y = true;
        t0Var.f97159j = false;
        t0Var.f97155f = 2;
        java.lang.Integer num2 = tinkerSyncResponse.f142410f;
        if (num2 != null && num2.intValue() == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.f142419r)) {
            b83.e eVar = new b83.e(lp0.a.f320249c, tinkerSyncResponse.f142419r);
            eVar.f(eVar.a(5));
            eVar.c(7, 0L);
        }
        long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        f447575e = new wn4.f(tinkerSyncResponse, b17, f447572b, f447573c, f447574d);
        com.tencent.mm.plugin.downloader.model.r0 i17 = com.tencent.mm.plugin.downloader.model.r0.i();
        wn4.f fVar = f447575e;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("downloadCallbackListener");
            throw null;
        }
        i17.a(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "download start");
        jx3.f.INSTANCE.idkeyStat(1429L, 11L, 1L, false);
        java.lang.Integer num3 = tinkerSyncResponse.f142410f;
        if (num3 != null && num3.intValue() == 4) {
            r45.bw3 bw3Var = new r45.bw3();
            bw3Var.f371093d = java.lang.String.valueOf(b17);
            bw3Var.f371094e = tinkerSyncResponse.f142412h;
            bw3Var.f371097h = java.lang.System.currentTimeMillis();
            bw3Var.f371096g = "2";
            c83.e.s(bw3Var);
            ((x73.g) x73.c.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f452441a).a("", tinkerSyncResponse, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.tencent.mm.plugin.hp.util.TinkerSyncResponse r17) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wn4.x.g(com.tencent.mm.plugin.hp.util.TinkerSyncResponse):void");
    }

    public final void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "updateFailToast");
        ((ku5.t0) ku5.t0.f312615d).B(wn4.w.f447570d);
    }
}
