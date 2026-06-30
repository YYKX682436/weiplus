package za4;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f471135b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.IntentFilter f471136c;

    /* renamed from: d, reason: collision with root package name */
    public volatile za4.f f471137d;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f471142i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f471138e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f471139f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f471140g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader.model.g1 f471141h = new za4.b(this);

    /* renamed from: a, reason: collision with root package name */
    public final za4.e f471134a = new za4.e(this, null);

    public k(za4.b bVar) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        this.f471136c = intentFilter;
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        this.f471142i = new za4.c(this, android.os.Looper.getMainLooper());
    }

    public static /* synthetic */ java.util.concurrent.ConcurrentHashMap a(za4.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = kVar.f471138e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return concurrentHashMap;
    }

    public static /* synthetic */ za4.f b(za4.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        za4.f fVar = kVar.f471137d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return fVar;
    }

    public static /* synthetic */ void c(za4.k kVar, dm.t3 t3Var, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        kVar.u(t3Var, i17, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public static void d(za4.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.sdk.platformtools.n3 n3Var = kVar.f471142i;
        n3Var.removeMessages(10008);
        n3Var.sendEmptyMessageDelayed(10008, 300000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public static za4.k g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        za4.k kVar = za4.j.f471130a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return kVar;
    }

    public static boolean l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDisableRegisterInstallReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_disable_register_apk_install_receiver, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "isDisableRegisterInstallReceiver is " + Ni);
            boolean z17 = true;
            if (Ni != 1) {
                z17 = false;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, z17 ? 95 : 96);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisableRegisterInstallReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "isDisableRegisterInstallReceiver, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisableRegisterInstallReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
    }

    public void e(java.lang.String str, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (android.text.TextUtils.isEmpty(str) || j3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "addReportInfo, but appid or apkReportInfo is null");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 85);
            ca4.e0.a("ad_app_download_exp", "", 7, 1002, "appid=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "addReportInfo, appid is " + str + ", uxInfo is " + j3Var.f165280f + ", downloadScene is " + j3Var.f165286o + ", clickScene is " + j3Var.f165287p);
        this.f471139f.put(str, new za4.i(j3Var.f165278d, j3Var.f165279e, j3Var.f165280f, j3Var.f165281g, j3Var.f165282h, j3Var.f165283i, j3Var.f165284m, j3Var.f165285n, j3Var.f165286o, j3Var.f165287p));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public int f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        try {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
            if (q17 != null) {
                if (q17.f96963f == 3 && !android.text.TextUtils.isEmpty(q17.f96964g) && com.tencent.mm.vfs.w6.j(q17.f96964g)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                    return 3;
                }
                int i17 = q17.f96963f;
                if (i17 == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                    return 1;
                }
                if (i17 == 2) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                    return 2;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "getDownloadStatus, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return 0;
    }

    public za4.i h(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a D0 = gVar.f380d.D0(j17);
        if (D0 == null || com.tencent.mm.sdk.platformtools.t8.K0(D0.field_rawAppId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "getReportInfo, fileDownloadInfo or field_rawAppId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return null;
        }
        za4.i iVar = (za4.i) this.f471139f.get(D0.field_rawAppId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return iVar;
    }

    public int i(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
        long j17 = q17.f96968n;
        int i17 = j17 != 0 ? (int) ((q17.f96967m * 100) / j17) : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return i17;
    }

    public boolean j(android.content.Context context, java.lang.String str, java.lang.String str2, za4.h hVar, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
        if (q17 == null || q17.f96963f != 3 || android.text.TextUtils.isEmpty(q17.f96964g)) {
            if (q17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "installApp, downloadtaskinfo==null-3, op=4, appid=" + str);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 79);
                ca4.e0.a("ad_app_download_exp", "", 5, 1001, "appid=" + str);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "installApp, info error and id=" + q17.f96961d + ", appid=" + q17.f96966i + ", status=" + q17.f96963f + ", downloadSize=" + q17.f96967m + ", url=" + q17.f96962e);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        long j17 = q17.f96961d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        u(gVar.f380d.D0(j17), 4, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        long j18 = q17.f96961d;
        za4.g gVar2 = new za4.g(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar3 = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar3.requireAccountInitialized();
        r(gVar3.f380d.D0(j18), 4001010, j18, gVar2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.lang.String str4 = q17.f96962e;
        yb0.a.f460612a.a(str4, str3);
        yb0.b.a(q17.f96964g, str4);
        zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
        java.lang.String str5 = q17.f96964g;
        ((yb0.c) yVar).getClass();
        com.tencent.mm.pluginsdk.model.app.n1.d(context, str5, null, false);
        p(str2, hVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return true;
    }

    public boolean k(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isApkExist", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
        boolean z17 = q17 != null && q17.f96963f == 3 && !android.text.TextUtils.isEmpty(q17.f96964g) && com.tencent.mm.vfs.w6.j(q17.f96964g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isApkExist", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return z17;
    }

    public boolean m(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        boolean b17 = ik1.b.b(context, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return b17;
    }

    public boolean n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseTaskByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        long o17 = o(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        boolean o18 = com.tencent.mm.plugin.downloader.model.r0.i().o(o17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseTaskByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return o18;
    }

    public long o(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
        long j17 = q17 != null ? q17.f96961d : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return j17;
    }

    public final void p(java.lang.String str, za4.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerInstallCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (hVar != null) {
            if (l()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AdDownloadApkMgr", "registerInstallCallback, but disable register installReceiver");
            } else {
                this.f471138e.put(str, hVar);
                com.tencent.mars.xlog.Log.w("MicroMsg.AdDownloadApkMgr", "register package receiver");
                if (!this.f471135b) {
                    try {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f471134a, this.f471136c);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "register package receiver, exp=" + e17.toString());
                    }
                }
                this.f471135b = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f471142i;
            n3Var.removeMessages(10008);
            n3Var.sendEmptyMessageDelayed(10008, 300000L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendInstallMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerInstallCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void q(int i17, java.lang.String str, za4.g gVar) {
        int i18;
        int i19;
        java.lang.String str2;
        java.lang.String str3;
        ca4.f fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        a02.g gVar2 = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar2.requireAccountInitialized();
        if (gVar2.f380d.z0(str) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "fileDownloadInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        za4.i iVar = (za4.i) this.f471139f.get(str);
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "reportInfo is null, appid = " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        java.lang.String str4 = iVar.f471113f;
        java.lang.String str5 = iVar.f471114g;
        int i27 = iVar.f471115h;
        java.lang.String str6 = iVar.f471116i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        java.lang.String str7 = iVar.f471111d;
        java.lang.String a17 = iVar.a();
        java.lang.String str8 = iVar.f471117m;
        int i28 = iVar.f471118n;
        int i29 = iVar.f471119o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        if (i17 != 4001011) {
            str3 = "reportConversionDownloadInfo";
        } else {
            if (gVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                i18 = (int) (java.lang.System.currentTimeMillis() - iVar.f471121q);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                i19 = gVar.f471080a;
            } else {
                i18 = 0;
                i19 = 0;
            }
            java.util.ArrayList arrayList = l44.z.f316428a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                fVar = new ca4.f();
                str2 = "reportConversionDownloadInfo";
            } catch (java.lang.Throwable th6) {
                th = th6;
                str2 = "reportConversionDownloadInfo";
            }
            try {
                fVar.m(4001011);
                fVar.o(str4);
                fVar.f(str5);
                fVar.l(i27);
                fVar.c(str6);
                fVar.p(str7);
                fVar.n(a17);
                fVar.q(str8);
                fVar.k(i29);
                fVar.e(i28);
                fVar.b(i19);
                fVar.g(i18);
                a84.t0.a(fVar.a());
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportInstallComplete, exp is " + th.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                str3 = str2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            str3 = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void r(dm.t3 t3Var, int i17, long j17, za4.g gVar) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (t3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(t3Var.field_rawAppId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "fileDownloadInfo or field_rawAppId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        za4.i iVar = (za4.i) this.f471139f.get(t3Var.field_rawAppId);
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "reportInfo is null, appid = " + t3Var.field_rawAppId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        java.lang.String a17 = iVar.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        java.lang.String str = iVar.f471113f;
        java.lang.String str2 = iVar.f471111d;
        java.lang.String str3 = iVar.f471114g;
        int i19 = iVar.f471115h;
        java.lang.String str4 = iVar.f471116i;
        java.lang.String str5 = iVar.f471117m;
        int i27 = iVar.f471118n;
        int i28 = iVar.f471119o;
        switch (i17) {
            case 4001001:
                java.util.ArrayList arrayList = l44.z.f316428a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar = new ca4.f();
                    fVar.m(4001001);
                    fVar.o(str);
                    fVar.f(str3);
                    fVar.l(i19);
                    fVar.c(str4);
                    fVar.p(str2);
                    fVar.n(a17);
                    fVar.q(str5);
                    fVar.k(i28);
                    fVar.e(i27);
                    a84.t0.a(fVar.a());
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportStartDownload, exp is " + th6.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001004:
                java.util.ArrayList arrayList2 = l44.z.f316428a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPauseDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar2 = new ca4.f();
                    fVar2.m(4001004);
                    fVar2.o(str);
                    fVar2.f(str3);
                    fVar2.l(i19);
                    fVar2.c(str4);
                    fVar2.p(str2);
                    fVar2.n(a17);
                    fVar2.q(str5);
                    fVar2.k(i28);
                    fVar2.e(i27);
                    fVar2.b(0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    fVar2.f39885n = 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    a84.t0.a(fVar2.a());
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportPauseDownload, exp is " + th7.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPauseDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001005:
                java.util.ArrayList arrayList3 = l44.z.f316428a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportResumeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar3 = new ca4.f();
                    fVar3.m(4001005);
                    fVar3.o(str);
                    fVar3.f(str3);
                    fVar3.l(i19);
                    fVar3.c(str4);
                    fVar3.p(str2);
                    fVar3.n(a17);
                    fVar3.q(str5);
                    fVar3.k(i28);
                    fVar3.e(i27);
                    fVar3.b(0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    fVar3.f39885n = 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    a84.t0.a(fVar3.a());
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportResumeDownload, exp is " + th8.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportResumeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001006:
                java.util.ArrayList arrayList4 = l44.z.f316428a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDownloadFailed", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar4 = new ca4.f();
                    fVar4.m(4001006);
                    fVar4.o(str);
                    fVar4.f(str3);
                    fVar4.l(i19);
                    fVar4.c(str4);
                    fVar4.p(str2);
                    fVar4.n(a17);
                    fVar4.q(str5);
                    fVar4.k(i28);
                    fVar4.e(i27);
                    a84.t0.a(fVar4.a());
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDownloadFailed, exp is " + th9.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadFailed", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001009:
                java.util.ArrayList arrayList5 = l44.z.f316428a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDownloadComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar5 = new ca4.f();
                    fVar5.m(4001009);
                    fVar5.o(str);
                    fVar5.f(str3);
                    fVar5.l(i19);
                    fVar5.c(str4);
                    fVar5.p(str2);
                    fVar5.n(a17);
                    fVar5.q(str5);
                    fVar5.k(i28);
                    fVar5.e(i27);
                    a84.t0.a(fVar5.a());
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportDownloadComplete, exp is " + th10.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001010:
                if (gVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    i18 = gVar.f471080a;
                } else {
                    i18 = 0;
                }
                iVar.f471121q = java.lang.System.currentTimeMillis();
                java.util.ArrayList arrayList6 = l44.z.f316428a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportInstallStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    ca4.f fVar6 = new ca4.f();
                    fVar6.m(4001010);
                    fVar6.o(str);
                    fVar6.f(str3);
                    fVar6.l(i19);
                    fVar6.c(str4);
                    fVar6.p(str2);
                    fVar6.n(a17);
                    fVar6.q(str5);
                    fVar6.k(i28);
                    fVar6.e(i27);
                    fVar6.b(i18);
                    a84.t0.a(fVar6.a());
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportInstallStart, exp is " + th11.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInstallStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void s(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, appId is null");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 86);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a z07 = gVar.f380d.z0(str);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, downloadinfo==null-2, appId=" + str + ", op=" + i17);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1958, 78);
            g0Var.A(1958, 87);
            ca4.e0.a("ad_app_download_exp", "", 2, i17, "appId=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        if (i17 == 2 && z07.field_downloaderType == 2) {
            java.lang.String str2 = z07.field_downloadUrl;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteTempApkFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "deleteTempApkFile, url is " + str2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteTempApkFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            } else {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.r0.i().f(str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteTempApkFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            }
        }
        t(i17, str, z07.field_packageName, z07.field_md5, z07.field_downloadUrl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public void t(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String sb6;
        int i18;
        java.lang.String str5 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.lang.System.currentTimeMillis();
        za4.i iVar = (za4.i) this.f471139f.get(str);
        java.lang.String str6 = "";
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, reportInfo is null, appid=" + str + ", op=" + i17 + ", pkg=" + str5);
            if (i17 == 9) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 75);
                ca4.e0.a("ad_app_download_exp", "", 3, i17, "appId=" + str);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 76);
                ca4.e0.a("ad_app_download_exp", "", 4, i17, "appId=" + str);
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            str5 = str5.replaceAll("\\.", "_");
        }
        if (iVar == null) {
            sb6 = "";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            sb7.append(iVar.f471111d);
            sb7.append(".");
            sb7.append(iVar.a());
            sb7.append(".");
            sb7.append(str5);
            sb7.append(".0.20.0");
            sb6 = sb7.toString();
        }
        if (iVar != null && (i18 = iVar.f471120p) != 0) {
            sb6 = sb6 + "." + i18;
            com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, op=" + i17 + ", downloadScene=" + iVar.f471119o + ", autoDownload=" + iVar.f471118n + ", clickScene=" + i18);
        } else if (iVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo but reportInfo is null");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, reportInfo is not null but clickScene is " + iVar.f471120p);
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = str4;
        objArr[3] = sb6;
        objArr[4] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        if (iVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            str6 = iVar.f471113f;
        }
        objArr[5] = str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < 6; i19++) {
            sb8.append(java.lang.String.valueOf(objArr[i19]));
            if (i19 != 5) {
                sb8.append(',');
            }
        }
        java.lang.String sb9 = sb8.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo %d  %s", 14542, sb9);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.f(14542, sb9, true, false);
        int i27 = -1;
        java.lang.String str7 = "appId=" + str + "|op=" + i17 + "|exprValue=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_apk_clickid_inject_android, -1);
        if (iVar != null) {
            str7 = str7 + "|traceId=" + iVar.a() + "|downloadScene=" + iVar.f471119o + "|autoDownload=" + iVar.f471118n + "|clickScene=" + iVar.f471120p;
        }
        ca4.e0.a("ad_app_download_op_report", "0", 0, i17, str7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report14542ForIdkey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        switch (i17) {
            case 1:
                i27 = 65;
                break;
            case 2:
                i27 = 66;
                break;
            case 3:
                i27 = 67;
                break;
            case 4:
                i27 = 68;
                break;
            case 5:
                i27 = 69;
                break;
            case 6:
                i27 = 70;
                break;
            case 7:
                i27 = 71;
                break;
            case 8:
                i27 = 72;
                break;
            case 9:
                i27 = 73;
                break;
        }
        if (i27 > 0) {
            g0Var.A(1958, i27);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report14542ForIdkey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public final void u(dm.t3 t3Var, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (t3Var != null) {
            s(i17, t3Var.field_rawAppId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, downloadinfo==null-1, op=" + i17 + ", id=" + j17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 77);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        sb6.append(j17);
        ca4.e0.a("ad_app_download_exp", "", 1, i17, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    public boolean v(java.lang.String str, za4.f fVar, java.lang.String str2, boolean z17, za4.h hVar, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().a(this.f471141h);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
        if (q17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdDownloadApkMgr", "resumeTask, downloadtaskinfo==null-4 and appid is " + str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 84);
            ca4.e0.a("ad_app_download_exp", "", 6, 1000, "appid=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        if (fVar != null) {
            this.f471137d = fVar;
        }
        this.f471139f.put(str, new za4.i(j3Var.f165278d, j3Var.f165279e, j3Var.f165280f, j3Var.f165281g, j3Var.f165282h, j3Var.f165283i, j3Var.f165284m, j3Var.f165285n, j3Var.f165286o, j3Var.f165287p));
        if (hVar != null) {
            str3 = "MicroMsg.AdDownloadApkMgr";
            com.tencent.mars.xlog.Log.i(str3, "resumeTask, autoInstall is " + z17 + ", packageName is " + str2);
            if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                p(str2, hVar);
            }
        } else {
            str3 = "MicroMsg.AdDownloadApkMgr";
        }
        com.tencent.mars.xlog.Log.i(str3, "resumeTask, id is " + q17.f96961d + ", appid is " + str);
        yb0.a.f460612a.a(q17.f96962e, j3Var.f165279e);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        boolean w17 = com.tencent.mm.plugin.downloader.model.r0.i().w(q17.f96961d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return w17;
    }

    public long w(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, za4.h hVar, za4.f fVar, boolean z18, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var) {
        long wi6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (z18) {
            com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
            aVar.f97234a = str5;
            aVar.f97237d = str2;
            aVar.f97238e = str;
            aVar.f97239f = str3;
            aVar.f97241h = str4;
            aVar.f97236c = str6;
            aVar.f97242i = 1;
            aVar.f97246m = z17;
            aVar.f97244k = 5101;
            wi6 = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, new za4.d(this));
        } else {
            com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
            t0Var.f97156g = str;
            t0Var.f97173x = str;
            t0Var.f97157h = str3;
            t0Var.f97154e = str4;
            t0Var.f97150a = str5;
            t0Var.f97153d = str6;
            t0Var.f97158i = z17;
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            wi6 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "startDownload, id is " + wi6 + ", appid is " + str + ", wxAppId is " + str2 + ", pkg is " + str3 + ", fileName is " + str6 + ", downloadUrl is " + str5);
        if (fVar != null) {
            this.f471137d = fVar;
        }
        if (z17) {
            p(str3, hVar);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f471140g.put(str, java.lang.Long.valueOf(wi6));
        }
        yb0.a.f460612a.a(str5, j3Var.f165279e);
        long j17 = wi6;
        this.f471139f.put(str, new za4.i(j3Var.f165278d, j3Var.f165279e, j3Var.f165280f, j3Var.f165281g, j3Var.f165282h, j3Var.f165283i, j3Var.f165284m, j3Var.f165285n, j3Var.f165286o, j3Var.f165287p));
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().a(this.f471141h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return j17;
    }

    public void x(java.lang.String str, za4.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (fVar != null) {
            this.f471137d = fVar;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().a(this.f471141h);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
        if (q17 != null) {
            long j17 = q17.f96961d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.tencent.mm.plugin.downloader.model.r0.i().t(j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTask", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }
}
