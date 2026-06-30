package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f188917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188918e;

    public h1(android.app.Activity activity, java.lang.String str) {
        this.f188917d = activity;
        this.f188918e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String encode;
        android.app.Activity activity = this.f188917d;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            java.lang.String c17 = com.tencent.mm.pluginsdk.model.app.j1.c(activity);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(c17);
            java.lang.String str = this.f188918e;
            if (K0 && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    encode = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "reportLaunchWechat parse fail");
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17591, "", c17, encode, 0);
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppUtil", "reportLaunchWechat callPackage=%s, isCategoryHome = %b, url=%s, isCategoryHome= %b", c17, bool, encode, bool);
            }
            encode = "";
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17591, "", c17, encode, 0);
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppUtil", "reportLaunchWechat callPackage=%s, isCategoryHome = %b, url=%s, isCategoryHome= %b", c17, bool2, encode, bool2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "reportLaunchWechat ex:%s", e17.getMessage());
        }
    }
}
