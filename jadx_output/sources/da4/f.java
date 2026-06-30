package da4;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da4.h f227780a;

    public f(da4.h hVar, da4.e eVar) {
        this.f227780a = hVar;
    }

    @Override // com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher
    public boolean a(android.content.Context context, java.lang.String str) {
        da4.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        da4.h hVar = this.f227780a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            iVar = null;
        } else {
            synchronized (hVar.f227786c) {
                try {
                    iVar = (da4.i) ((java.util.HashMap) hVar.f227786c).remove(str);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                    throw th6;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        if (iVar == null) {
            com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "onAppInstalled is called, but the pkg is not existed!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
            return false;
        }
        java.lang.String str2 = "apkPackage=" + iVar.f227788a + "|op=5|exprValue=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_apk_clickid_inject_android, -1);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = iVar.f227794g;
        if (snsInfo != null) {
            str2 = str2 + "|aid" + snsInfo.getAid() + "|traceId=" + iVar.f227794g.getTraceid() + "|fromSource=" + iVar.f227797j + "|fromAdType=" + iVar.f227798k;
        }
        ca4.e0.a("ad_app_download_op_report", "1", 0, 5, str2);
        int i17 = iVar.f227797j;
        if (i17 == 0 || i17 == 2) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            if (iVar.f227792e) {
                arrayMap.put("outSns", 1);
            }
            da4.a.h(iVar.f227789b, iVar.f227790c, iVar.f227791d, 3, "0", arrayMap);
        }
        int i18 = iVar.f227798k;
        if (i18 == 0) {
            java.lang.String str3 = iVar.f227790c;
            ca4.d dVar = new ca4.d(str3, iVar.f227791d, ca4.m0.D(str3), ca4.m0.P(iVar.f227790c), ca4.m0.L(iVar.f227790c));
            dVar.a((int) (java.lang.System.currentTimeMillis() - iVar.f227795h));
            java.lang.String str4 = iVar.f227796i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdReportParams", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            dVar.f39855e = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdReportParams", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            dVar.c(iVar.f227799l);
            l44.z.e(dVar, 1);
        } else if (i18 == 1) {
            ca4.f fVar = new ca4.f();
            fVar.m(4001011);
            fVar.o(iVar.f227790c);
            fVar.p(ca4.m0.D(iVar.f227790c));
            fVar.n(ca4.m0.P(iVar.f227790c));
            fVar.q(ca4.m0.P(iVar.f227790c));
            fVar.k(4);
            fVar.d(iVar.f227796i);
            a84.t0.a(fVar.a());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher
    public boolean b(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppUninstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppUninstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        return false;
    }
}
