package n74;

/* loaded from: classes4.dex */
public abstract class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(android.content.Context context, s34.p0 p0Var) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpLiteApp", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpLiteAppHelper");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1612, 172);
        if (context != null && p0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
            java.lang.String str = p0Var.f402732a;
            boolean z17 = (str == null || str.length() == 0) ^ true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
            if (z17) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    q80.d0 d0Var = new q80.d0();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    d0Var.f360649a = str;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPage", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPage", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    java.lang.String str2 = p0Var.f402733b;
                    java.lang.String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    d0Var.f360650b = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQuery", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQuery", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    java.lang.String str4 = p0Var.f402734c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    d0Var.f360651c = str4;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMinVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMinVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    java.lang.String str5 = p0Var.f402735d;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    d0Var.f360654f = str3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHalfScreen", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfScreen", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    d0Var.f360657i = p0Var.f402736e ? 1 : 0;
                    com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeightPercent", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeightPercent", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    liteAppHalfScreenConfig.f143411e = p0Var.f402737f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableDragToCloseInHalfScreen", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableDragToCloseInHalfScreen", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                    liteAppHalfScreenConfig.f143414h = p0Var.f402738g;
                    d0Var.f360661m = liteAppHalfScreenConfig;
                    com.tencent.mars.xlog.Log.i("AdJumpLiteAppHelper", "openLiteApp() called with: appId = " + d0Var.f360649a + ", page = " + d0Var.f360650b + ", query = " + d0Var.f360651c + ", minVersion = " + d0Var.f360654f + ", openType = " + d0Var.f360657i + ", heightPercent = " + d0Var.f360661m.f143411e + ", enableDragToClose = " + d0Var.f360661m.f143414h);
                    q80.g0 g0Var2 = (q80.g0) i95.n0.c(q80.g0.class);
                    if (g0Var2 != null) {
                        ((com.tencent.mm.feature.lite.i) g0Var2).lk(context, d0Var, new n74.w());
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpLiteApp", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpLiteAppHelper");
                return true;
            }
        }
        g0Var.A(1612, ib1.t.CTRL_INDEX);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpLiteApp", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpLiteAppHelper");
        return false;
    }
}
