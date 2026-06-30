package s34;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402759a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402760b;

    /* renamed from: c, reason: collision with root package name */
    public final int f402761c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402762d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402763e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f402764f;

    public s0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, java.lang.String str4, kotlin.jvm.internal.i iVar) {
        this.f402759a = str;
        this.f402760b = str2;
        this.f402761c = i17;
        this.f402762d = str3;
        this.f402763e = i18;
        this.f402764f = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s34.s0 c(java.util.Map map, java.lang.String str) {
        s34.s0 s0Var;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        } else {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String str2 = (java.lang.String) map.get(str.concat(".username"));
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = (java.lang.String) map.get(str.concat(".path"));
                java.lang.String str5 = str4 == null ? "" : str4;
                java.lang.String str6 = (java.lang.String) map.get(str.concat(".version"));
                int intValue = (str6 == null || (h18 = r26.h0.h(str6)) == null) ? 0 : h18.intValue();
                java.lang.String str7 = (java.lang.String) map.get(str.concat(".requestId"));
                java.lang.String str8 = str7 == null ? "" : str7;
                java.lang.String str9 = (java.lang.String) map.get(str.concat(".preloadFlag"));
                int intValue2 = (str9 == null || (h17 = r26.h0.h(str9)) == null) ? 0 : h17.intValue();
                java.lang.String str10 = (java.lang.String) map.get(str.concat(".ecsJumpInfoBase64Str"));
                s0Var = kotlin.Result.m521constructorimpl(new s34.s0(str3, str5, intValue, str8, intValue2, str10 == null ? "" : str10, null));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                s0Var = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(s0Var)) {
                ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(s0Var));
            }
            r11 = kotlin.Result.m527isFailureimpl(s0Var) ? null : s0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        return r11;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestId", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestId", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        return this.f402762d;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        return this.f402761c;
    }
}
