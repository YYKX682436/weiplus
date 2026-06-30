package tn4;

@j95.b
/* loaded from: classes11.dex */
public class o extends i95.w implements un4.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f420838d = 16794113;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3[] f420839e = {null};

    /* renamed from: f, reason: collision with root package name */
    public boolean f420840f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f420841g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f420842h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f420843i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f420844m = null;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f420845n = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490351sj);

    public final boolean Ai(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        boolean z17;
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f420843i;
        if (j0Var == null || !j0Var.isShowing()) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            return false;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            wj(tinkerSyncResponse);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new tn4.g(this, tinkerSyncResponse));
        }
        return false;
    }

    public void Bi() {
        if (this.f420840f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkInitTpcConfig but has init");
        }
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        java.lang.String dir = lp0.b.h0("TPCFileTemp").o();
        kotlin.jvm.internal.o.g(dir, "dir");
        t95.h.f416594b = dir;
        t95.d.f416589a = new tn4.e(this);
        this.f420840f = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "initTpcConfig success");
    }

    public boolean Di() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        r45.mm6 m17 = c83.e.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, dialogInfo = %s.", m17);
        if (m17 == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, have tinker update.");
        ((ku5.t0) ku5.t0.f312615d).g(new tn4.m(this, m17, context));
        return false;
    }

    public void Ni(boolean z17, boolean z18, boolean z19) {
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        synchronized (this.f420839e) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f420839e[0];
            if (n3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Updater.PluginUpdater", "[-] Unexpected that mmHandler is null.");
                return;
            }
            if (n3Var.hasMessages(this.f420838d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion hasMessages.");
                this.f420839e[0].removeMessages(this.f420838d);
            }
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = this.f420838d;
            obtain.arg1 = z17 ? 1 : 0;
            obtain.arg2 = z18 ? 1 : 0;
            this.f420839e[0].sendMessageDelayed(obtain, z19 ? 0L : 3000L);
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMdiffUpdatePatchPkgVersion send.");
        }
    }

    public boolean Ri(oq1.n nVar) {
        if (nVar != null) {
            com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = (com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar;
            if (tinkerSyncResponse.a() && tinkerSyncResponse.i() && !tinkerSyncResponse.h() && !tinkerSyncResponse.f()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkTinkerSyncResponseVaild, yes, response = %s", nVar);
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkTinkerSyncResponseVaild, no, response = %s", nVar);
        return false;
    }

    public java.lang.String Ui(int i17) {
        java.lang.String str = "";
        if (o45.wf.f343031i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "is GP version: %s", java.lang.Integer.valueOf(o45.wf.f343029g));
            return "";
        }
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_full_pkg_update_default_params, "", true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "tabConfig = null.");
                return "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            int parseInt = java.lang.Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
            int i18 = o45.wf.f343029g;
            java.lang.String string = jSONObject.getString("updateWebviewUrl");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "minBaseApk = %s, updateWebviewUrl = %s.", java.lang.Integer.valueOf(parseInt), string);
                if (parseInt > i18 && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    if (i17 == 1) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).rj(parseInt);
                    } else if (i17 != 2) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(parseInt);
                    } else {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).sj(parseInt);
                    }
                    return string;
                }
                return "";
            } catch (java.lang.Exception e17) {
                e = e17;
                str = string;
                com.tencent.mars.xlog.Log.w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e.getMessage());
                return str;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public java.util.HashMap Vi() {
        java.lang.String Zi;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        if (o45.wf.f343031i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, is GP version: %s", java.lang.Integer.valueOf(o45.wf.f343029g));
            return null;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, isTeenMode()");
            return null;
        }
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_full_pkg_update_default_params, "", true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Updater.PluginUpdater", "parse tabconfig failed: %s", e17.getMessage());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, tabConfig = null.");
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
        int parseInt = java.lang.Integer.parseInt(jSONObject.getString("minBaseApk").substring(2), 16);
        int i18 = o45.wf.f343029g;
        java.lang.String string = jSONObject.getString("updateWebviewUrl");
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkXkeyUpdateUrlFullPkgVersion, minBaseApk = " + parseInt + "updateWebviewUrl = " + string);
        if (parseInt <= i18 || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return null;
        }
        try {
            str = jSONObject.getString("dialogTipsContent");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "without dialog content, no show dialog.");
            return hashMap;
        }
        try {
            str2 = jSONObject.getString("downloadUrl");
        } catch (java.lang.Exception unused2) {
            str2 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "without downloadUrl, no show dialog.");
            return hashMap;
        }
        hashMap.put("task_url", str2);
        hashMap.put("page_url", string);
        hashMap.put("dialog_tips_content", str);
        android.os.Bundle e18 = com.tencent.mm.ui.mmfb.sdk.l.e(string.toLowerCase());
        hashMap.put("version", e18.get("version"));
        try {
            i17 = java.lang.Integer.parseInt("" + e18.get("version"));
        } catch (java.lang.Exception unused3) {
            i17 = 0;
        }
        if (i17 > 0) {
            hashMap.put("task_name", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.bro, com.tencent.mm.sdk.platformtools.a0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i17)));
        } else {
            hashMap.put("task_name", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.brn));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "results = %s.", hashMap);
        return hashMap;
    }

    public void Zi() {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("KeyXUpdateVersion", "").apply();
    }

    public void aj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "clickAboutWechatRedDot");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    public void bj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "clickCheckUpdateRedDot");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("RedDotCheckUpdateTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
    }

    public void cj(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "clickManualUpdaterTabRedDot");
        if (z17) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
            sharedPreferences.edit().putInt("RedCheckManualUpdaterTab", 0).putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
        } else {
            android.content.SharedPreferences sharedPreferences2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            kotlin.jvm.internal.o.f(sharedPreferences2, "getSharedPreferences(...)");
            sharedPreferences2.edit().putInt("RedDotAboutWechatTab", 0).putInt("RedDotSettingTab", 0).putInt("RedDotBottomTab", 0).apply();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fj(oq1.n r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn4.o.fj(oq1.n, int, boolean):boolean");
    }

    public java.lang.String hj() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            java.lang.String k17 = bm5.o1.f22719a.k(bm5.h0.RepairerConfig_Updater_TinkerBaseId_String, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "getBasePatchId, repairerBaseId = %s", k17);
                return k17;
            }
        }
        java.lang.String str = lp0.a.f320256j;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str != null ? str : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "getBasePatchId, baseTinkerId = %s", str2);
        return str2;
    }

    public java.lang.String ij() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            java.lang.String k17 = bm5.o1.f22719a.k(bm5.h0.RepairerConfig_Updater_TinkerPatchId_String, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "getBasePatchId, repairerPatchId = %s", k17);
                return k17;
            }
        }
        java.lang.String a17 = lp0.a.a();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return a17 == null ? "" : a17;
    }

    public boolean mj() {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences.getInt("RedDotAboutWechatTab", 0) == 1;
    }

    public boolean nj() {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences.getInt("RedCheckManualUpdaterTab", 0) == 1;
    }

    public boolean oj() {
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_full_pkg_update_default_params, "", true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "tabConfig = null.");
                return false;
            }
            int parseInt = java.lang.Integer.parseInt(new org.json.JSONObject(Zi).getString("minBaseApk").substring(2), 16);
            int i17 = o45.wf.f343029g;
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "hasXUpdateVersion minBaseApk = %s", java.lang.Integer.valueOf(parseInt));
            return parseInt > i17;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        wn4.x.b();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        synchronized (this.f420839e) {
            this.f420839e[0] = new tn4.f(this);
        }
    }

    public boolean pj(r45.mm6 mm6Var) {
        if (mm6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, dialoginfo = null.");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mm6Var.f380672h)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, dialoginfo.oldApkMd5 = null.");
            w73.f.h(1001, mm6Var.f380681t);
            return true;
        }
        if (mm6Var.f380681t == 4) {
            java.lang.String g17 = c83.e.g(c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a));
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkTinkerBoostInstall, HdiffApk, oldApkMd5 is equal?: %s， dialogInfo.newApkPath = %s, oldApkMd5  = %s, dialogInfo.oldApkMd5 = %s.", java.lang.Boolean.valueOf(mm6Var.f380672h.equalsIgnoreCase(g17)), mm6Var.f380669e, g17, mm6Var.f380672h);
            if (!mm6Var.f380672h.equalsIgnoreCase(g17)) {
                c83.e.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()) {
                    ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).cj(true);
                }
                wn4.x xVar = wn4.x.f447571a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification, hdiff");
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((android.app.NotificationManager) systemService).cancel(9342);
                w73.f.e();
                return true;
            }
        } else {
            java.lang.String g18 = c83.e.g(c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a));
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "isApkHasUpdateIndialogInfo, oldApkMd5 = %s.", g18);
            if (!mm6Var.f380672h.equalsIgnoreCase(g18)) {
                c83.e.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).nj()) {
                    ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).cj(true);
                }
                wn4.x xVar2 = wn4.x.f447571a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification, hdiff");
                java.lang.Object systemService2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
                kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                ((android.app.NotificationManager) systemService2).cancel(9342);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qj(int r21, android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn4.o.qj(int, android.content.Context):void");
    }

    public void rj(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDot %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 26L, 1L, false);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("KeyCurrentUpdateVersion", i17).putInt("RedDotCheckUpdateTab", 1).apply();
    }

    public void sj(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "setCheckUpdateWithoutRedDot %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 26L, 1L, false);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("KeyCurrentUpdateVersion", i17).apply();
    }

    public void tj(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDot %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 26L, 1L, false);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("KeyXUpdateVersion", "").putInt("KeyCurrentUpdateVersion", i17).putInt("RedDotCheckUpdateTab", 1).putInt("RedDotAboutWechatTab", 1).putInt("RedDotSettingTab", 1).putInt("RedDotBottomTab", 1).apply();
    }

    public void uj(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDotWhenMMDiff %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 26L, 1L, false);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putString("KeyXUpdateVersion", "").putInt("KeyTinkerPatchVersion", i17).putInt("RedCheckManualUpdaterTab", 1).putInt("RedDotAboutWechatTab", 1).putInt("RedDotSettingTab", 1).putInt("RedDotBottomTab", 1).apply();
    }

    public void vj(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "setFullCheckUpdateRedDotWhenMMDiff %s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 26L, 1L, false);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 25L, 1L, false);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("KeyTinkerPatchVersion", i17).putInt("RedCheckManualUpdaterTab", 1).putInt("RedDotAboutWechatTab", 1).apply();
    }

    public boolean wi(android.content.Context context, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "HdiffApk checkAndShowInstallPatchDialog, newApkMd5 = " + str);
        java.lang.String l17 = c83.e.l(str);
        if (!com.tencent.mm.vfs.w6.j(l17) || !uk.b.a(l17) || !c83.e.n(l17)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkAndShowInstallPatchDialog apk ready %s." + l17);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.k3o));
        u1Var.n(context.getString(com.tencent.mm.R.string.k3n));
        u1Var.j(context.getString(com.tencent.mm.R.string.k3m));
        u1Var.l(new tn4.n(this, l17));
        u1Var.q(false);
        return true;
    }

    public final void wj(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f420843i;
        if (j0Var != null && j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk update dialog is showing.");
            return;
        }
        boolean z17 = tinkerSyncResponse.e() == 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkHdiffInstall.HdiffApk show update dialog");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(com.tencent.mm.sdk.platformtools.t8.K0(tinkerSyncResponse.b()) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493423k43) : tinkerSyncResponse.b());
        u1Var.m(com.tencent.mm.R.string.fdx);
        u1Var.a(true);
        u1Var.b(new tn4.h(this, tinkerSyncResponse, z17));
        u1Var.e(new tn4.i(this));
        u1Var.q(false);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f420844m;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f420844m = null;
        }
        this.f420843i = u1Var.f211998c;
        w73.f.k(z17 ? 108 : com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, z17 ? 108L : 308L, 1L, false);
    }
}
