package s34;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402673a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402674b;

    /* renamed from: c, reason: collision with root package name */
    public final int f402675c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402677e;

    /* renamed from: f, reason: collision with root package name */
    public final int f402678f;

    public j0(java.lang.String weappUserName, java.lang.String weappPath, int i17, java.lang.String prerenderWeappPath, int i18, int i19) {
        kotlin.jvm.internal.o.g(weappUserName, "weappUserName");
        kotlin.jvm.internal.o.g(weappPath, "weappPath");
        kotlin.jvm.internal.o.g(prerenderWeappPath, "prerenderWeappPath");
        this.f402673a = weappUserName;
        this.f402674b = weappPath;
        this.f402675c = i17;
        this.f402676d = prerenderWeappPath;
        this.f402677e = i18;
        this.f402678f = i19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s34.j0 d(java.util.Map map, java.lang.String str) {
        s34.j0 j0Var;
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        } else {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String str2 = (java.lang.String) map.get(str.concat(".weappUserName"));
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = (java.lang.String) map.get(str.concat(".weappPath"));
                java.lang.String str5 = str4 == null ? "" : str4;
                java.lang.String str6 = (java.lang.String) map.get(str.concat(".weappVersion"));
                int intValue = (str6 == null || (h19 = r26.h0.h(str6)) == null) ? 0 : h19.intValue();
                java.lang.String str7 = (java.lang.String) map.get(str.concat(".prerenderWeappPath"));
                java.lang.String str8 = str7 == null ? "" : str7;
                java.lang.String str9 = (java.lang.String) map.get(str.concat(".miniProgramType"));
                int intValue2 = (str9 == null || (h18 = r26.h0.h(str9)) == null) ? 0 : h18.intValue();
                java.lang.String str10 = (java.lang.String) map.get(str.concat(".needPrerender"));
                j0Var = kotlin.Result.m521constructorimpl(new s34.j0(str3, str5, intValue, str8, intValue2, (str10 == null || (h17 = r26.h0.h(str10)) == null) ? 0 : h17.intValue()));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                j0Var = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(j0Var)) {
                ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(j0Var));
            }
            r11 = kotlin.Result.m527isFailureimpl(j0Var) ? null : j0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return r11;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPrerenderWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPrerenderWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return this.f402676d;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return this.f402674b;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeappUserName", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeappUserName", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return this.f402673a;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        java.lang.String str = "[weappUserName is " + this.f402673a + ", weappPath is " + this.f402674b + ", weappVersion is " + this.f402675c + ", prerenderWeappPath is " + this.f402676d + ", needPrerender is " + this.f402678f + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return str;
    }
}
