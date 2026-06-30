package com.tencent.mm.plugin.hp.mmdiff;

/* loaded from: classes8.dex */
public class MMDiffInstallApkService extends android.app.IntentService {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f142387q = 0;

    /* renamed from: d, reason: collision with root package name */
    public x73.e f142388d;

    /* renamed from: e, reason: collision with root package name */
    public long f142389e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f142390f;

    /* renamed from: g, reason: collision with root package name */
    public int f142391g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f142392h;

    /* renamed from: i, reason: collision with root package name */
    public int f142393i;

    /* renamed from: m, reason: collision with root package name */
    public int f142394m;

    /* renamed from: n, reason: collision with root package name */
    public int f142395n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f142396o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader.model.g1 f142397p;

    public MMDiffInstallApkService() {
        super("MMDiffInstallApkService");
        this.f142397p = new x73.d(this);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onDestroy hasCallback=%b", java.lang.Boolean.valueOf(this.f142390f));
        if (!this.f142390f) {
            this.f142390f = true;
        }
        com.tencent.mm.plugin.downloader.model.r0.i().s(this.f142397p);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.Map d17;
        int P;
        int i17;
        long b17;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("Tinker.MMDiffInstallApkService.HdiffApk", "AbstractResultService received a null intent, ignoring.");
            stopSelf();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("notify_type_extra");
        if ("mmdiff_apk_has_ready".equals(stringExtra)) {
            java.util.Map map = c83.e.f39678a;
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).edit().putLong(c83.e.f39680c, java.lang.System.currentTimeMillis()).apply();
            w73.a.e("mmdiff_goto_apk_install", 0, 0);
            stopSelf();
            return;
        }
        if ("mmdiff_apk_has_update_notify".equals(stringExtra)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("mmdiff_udpate_maunal_cgi", true);
            intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI").addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/hp/mmdiff/MMDiffInstallApkService", "onHandleIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/hp/mmdiff/MMDiffInstallApkService", "onHandleIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            w73.f.h(103, 4);
            stopSelf();
            return;
        }
        if ("mmdiff_download_full_apk_notify".equals(stringExtra)) {
            this.f142392h = com.tencent.mm.sdk.platformtools.x2.f193071a;
            x73.e eVar = x73.e.TO_DOWNLOAD;
            com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "setDownloadState old=%s new=%s", this.f142388d, eVar);
            this.f142388d = eVar;
            java.lang.String stringExtra2 = intent.getStringExtra("task_name");
            java.lang.String stringExtra3 = intent.getStringExtra("task_url");
            java.lang.String stringExtra4 = intent.getStringExtra("alternative_url");
            long longExtra = intent.getLongExtra("task_size", 0L);
            java.lang.String stringExtra5 = intent.getStringExtra("file_md5");
            java.lang.String stringExtra6 = intent.getStringExtra("extInfo");
            java.lang.String stringExtra7 = intent.getStringExtra("fileType");
            java.lang.String stringExtra8 = intent.getStringExtra("appid");
            this.f142396o = intent.getStringExtra("package_name");
            java.lang.String stringExtra9 = intent.getStringExtra("thumb_url");
            java.lang.String stringExtra10 = intent.getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String stringExtra11 = intent.getStringExtra("page_url");
            int intExtra = intent.getIntExtra("task_scene", 0);
            this.f142393i = intent.getIntExtra("page_scene", 0);
            this.f142395n = intent.getIntExtra("from_scene", 0);
            this.f142394m = intent.getIntExtra("task_download_type", 0);
            java.lang.String str6 = stringExtra10;
            java.lang.String str7 = stringExtra4;
            com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onCreate: md5=%s, url=%s, extInfo=%s, fileType=%s, appId=%s, packageName=%s, taskSize=%d, thumbUrl=%s, pageScene=%s", stringExtra5, stringExtra3, stringExtra6, stringExtra7, stringExtra8, this.f142396o, java.lang.Long.valueOf(longExtra), stringExtra9, java.lang.Integer.valueOf(this.f142393i));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, stringExtra8, 1, stringExtra11, stringExtra3, java.lang.Integer.valueOf(this.f142395n));
            this.f142391g = com.tencent.mm.sdk.platformtools.t8.P(stringExtra7, 1);
            java.lang.String stringExtra12 = intent.getStringExtra("app_developer");
            java.lang.String stringExtra13 = intent.getStringExtra("app_version");
            java.lang.String stringExtra14 = intent.getStringExtra("app_privacy_url");
            java.lang.String stringExtra15 = intent.getStringExtra("app_permission_url");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra12) || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra13) || com.tencent.mm.sdk.platformtools.t8.K0(this.f142396o)) {
                try {
                    d17 = com.tencent.mm.sdk.platformtools.aa.d(com.tencent.mm.sdk.platformtools.t8.e(getAssets().open("app_info_arrays.xml")), "apps", null);
                    P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".apps.$count"), 0);
                    i17 = 0;
                } catch (java.io.IOException unused) {
                }
                while (i17 < P) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".apps.app");
                    sb6.append(i17 > 0 ? java.lang.Integer.valueOf(i17) : "");
                    java.lang.String sb7 = sb6.toString();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(sb7);
                    int i18 = P;
                    sb8.append(".$name");
                    java.lang.String str8 = (java.lang.String) d17.get(sb8.toString());
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(sb7);
                    str2 = str7;
                    try {
                        sb9.append(".$package");
                        java.lang.String str9 = (java.lang.String) d17.get(sb9.toString());
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        sb10.append(sb7);
                        str = stringExtra3;
                        try {
                            sb10.append(".$task");
                            java.lang.String str10 = (java.lang.String) d17.get(sb10.toString());
                            str3 = str6;
                            try {
                                if (!str8.equalsIgnoreCase(str3) && !str8.equalsIgnoreCase(stringExtra2) && !str9.equalsIgnoreCase(this.f142396o) && !str10.equalsIgnoreCase(stringExtra2)) {
                                    i17++;
                                    str6 = str3;
                                    P = i18;
                                    str7 = str2;
                                    stringExtra3 = str;
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra13)) {
                                    stringExtra13 = (java.lang.String) d17.get(sb7 + ".$version");
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra12)) {
                                    stringExtra12 = (java.lang.String) d17.get(sb7 + ".$developer");
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142396o)) {
                                    this.f142396o = str9;
                                }
                            } catch (java.io.IOException unused2) {
                            }
                        } catch (java.io.IOException unused3) {
                        }
                    } catch (java.io.IOException unused4) {
                        str = stringExtra3;
                    }
                    str4 = stringExtra12;
                    str5 = stringExtra13;
                }
                str = stringExtra3;
                str2 = str7;
                str3 = str6;
                str4 = stringExtra12;
                str5 = stringExtra13;
            } else {
                str = stringExtra3;
                str2 = str7;
                str4 = stringExtra12;
                str5 = stringExtra13;
                str3 = str6;
            }
            com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "title:%s taskName:%s, package:%s, version:%s, developer:%s, permissionUrl:%s, privacyAgreementUrl:%s", str3, stringExtra2, this.f142396o, str5, str4, stringExtra15, stringExtra14);
            if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(this.f142392h)) {
                dp.a.makeText(this.f142392h, getString(com.tencent.mm.R.string.f492208fm1), 0).show();
                com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "startDownload fail, network not ready");
                return;
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(this.f142392h)) {
                java.lang.String str11 = this.f142396o;
                java.lang.String str12 = str;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, stringExtra8, 2, stringExtra11, str12, java.lang.Integer.valueOf(this.f142395n));
                com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                t0Var.f97150a = str12;
                t0Var.f97151b = str2;
                t0Var.f97153d = stringExtra2;
                t0Var.f97154e = stringExtra5;
                t0Var.f97156g = stringExtra8;
                t0Var.f97157h = str11;
                t0Var.f97158i = true;
                t0Var.f97155f = this.f142391g;
                t0Var.f97166q = stringExtra6;
                t0Var.f97161l = intExtra;
                boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_download_use_mars, 1) == 1;
                int i19 = this.f142394m;
                if (i19 == 1 && z17) {
                    t0Var.f97171v = i19;
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
                } else {
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
                }
                com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "downloadOpBtn.onClick, lastDownloadId = %d, downloadId=%d, useMars=%b, downloadType=%d", java.lang.Long.valueOf(this.f142389e), java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f142394m));
                this.f142389e = b17;
                this.f142390f = true;
                if (b17 <= 0) {
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.ceh), 1).show();
                    stopSelf();
                } else {
                    x73.e eVar2 = x73.e.DOWNLOADING;
                    com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "setDownloadState old=%s new=%s", this.f142388d, eVar2);
                    this.f142388d = eVar2;
                    ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).wi("WebViewDownloadUI_startDownload");
                }
            }
            com.tencent.mm.plugin.downloader.model.r0.i().a(this.f142397p);
        }
    }
}
