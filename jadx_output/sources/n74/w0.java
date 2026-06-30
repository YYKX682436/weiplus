package n74;

/* loaded from: classes4.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.String f335444a = "";

    public static void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        com.tencent.mars.xlog.Log.i("AdWuidHelper", "clearWuid, old=" + f335444a);
        f335444a = "";
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1940, 6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
    }

    public static java.lang.String b(boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.String str2 = f335444a;
        if (!android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.i("AdWuidHelper", "doGetWuid, hit mem cache=" + str2 + ", isPreload=" + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.String d17 = d();
        if (android.text.TextUtils.isEmpty(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            str = "";
        } else {
            str = p34.o.c(d17);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWuidFromLocalCache", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("AdWuidHelper", "doGetWuid, hit local cache=" + str + ", isPreload=" + z17);
            f335444a = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return str;
        }
        com.tencent.mars.xlog.Log.i("AdWuidHelper", "doGetWuid, empty, isPreload=" + z17);
        if (z17 && com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ku5.t0) ku5.t0.f312615d).g(new n74.v0());
        }
        java.lang.String str3 = f335444a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return str3;
    }

    public static java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.System.currentTimeMillis();
        java.lang.String b17 = b(false);
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1940, 1);
        if (android.text.TextUtils.isEmpty(b17)) {
            g0Var.A(1940, 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return b17;
    }

    public static java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWuidCacheKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        java.lang.String str = "";
        try {
            java.lang.String j17 = gm0.j1.b().j();
            if (!android.text.TextUtils.isEmpty(j17)) {
                str = "ad_wuid_" + j17;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdWuidHelper", "getWuidCacheKey, exp=" + th6.toString());
        }
        com.tencent.mars.xlog.Log.i("AdWuidHelper", "getWuidCacheKey, key=" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1940, 5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWuidCacheKey", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return str;
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        java.lang.String b17 = n74.d2.b(str, 13);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.UxInfoHelper");
        if (android.text.TextUtils.isEmpty(b17)) {
            com.tencent.mars.xlog.Log.w("AdWuidHelper", "updateWuid, empty wuid, uxInfo=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            return "";
        }
        com.tencent.mars.xlog.Log.i("AdWuidHelper", "updateWuid:" + b17 + ", uxInfo=" + str);
        f335444a = b17;
        java.lang.String d17 = d();
        if (android.text.TextUtils.isEmpty(d17)) {
            com.tencent.mars.xlog.Log.e("AdWuidHelper", "updateWuid, cacheKey is empty");
        } else {
            p34.o.g(d17, b17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        return b17;
    }
}
