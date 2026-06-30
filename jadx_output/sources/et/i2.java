package et;

@j95.b
/* loaded from: classes7.dex */
public class i2 extends i95.w implements ft.l4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f256466d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f256467e = new java.util.concurrent.ConcurrentSkipListSet(new et.i2$$a());

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        this.f256466d.set(true);
        k91.k4.g().add(ea1.p.f250540d);
        while (true) {
            java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.f256467e;
            if (concurrentSkipListSet.isEmpty()) {
                return;
            }
            l75.q0 q0Var = (l75.q0) concurrentSkipListSet.pollFirst();
            if (q0Var != null && com.tencent.mm.plugin.appbrand.app.r9.hj() != null) {
                com.tencent.mm.plugin.appbrand.app.r9.hj().add(q0Var);
            }
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        java.lang.Object obj;
        super.onAccountReleased(context);
        this.f256466d.set(false);
        try {
            bm5.i1 i1Var = k91.k4.f305663e;
            synchronized (i1Var) {
                obj = i1Var.f22693c;
            }
            k91.k4 k4Var = (k91.k4) obj;
            if (k4Var != null) {
                k4Var.remove(ea1.p.f250540d);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo wi(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo;
        android.database.Cursor E;
        if (com.tencent.mm.plugin.appbrand.app.r9.hj() == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appusage.f3 hj6 = com.tencent.mm.plugin.appbrand.app.r9.hj();
        hj6.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (E = hj6.f76434e.E("AppBrandLauncherLayoutItem", null, java.lang.String.format(java.util.Locale.US, "%s=? and %s=?", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "recordId"), new java.lang.String[]{java.lang.String.valueOf(2), str}, null, null, null)) == null) {
            appBrandRecentTaskInfo = null;
        } else {
            if (E.moveToFirst()) {
                com.tencent.mm.plugin.appbrand.appusage.c3 c3Var = new com.tencent.mm.plugin.appbrand.appusage.c3();
                c3Var.convertFrom(E);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(c3Var.field_brandId)) {
                    appBrandRecentTaskInfo = k91.k4.b(java.lang.String.valueOf(c3Var.field_recordId), c3Var.field_brandId, c3Var.field_versionType, c3Var.field_updateTime, c3Var.field_usedInThirdPartyAppRecently, c3Var.field_thirdPartyAppUsingDesc);
                    appBrandRecentTaskInfo.f76366i = c3Var.field_appPath;
                    E.close();
                }
            }
            appBrandRecentTaskInfo = null;
            E.close();
        }
        if (appBrandRecentTaskInfo == null) {
            return null;
        }
        return appBrandRecentTaskInfo;
    }
}
