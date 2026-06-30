package s34;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402732a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402733b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f402734c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402735d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f402736e;

    /* renamed from: f, reason: collision with root package name */
    public final double f402737f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f402738g;

    public p0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, double d17, boolean z18, kotlin.jvm.internal.i iVar) {
        this.f402732a = str;
        this.f402733b = str2;
        this.f402734c = str3;
        this.f402735d = str4;
        this.f402736e = z17;
        this.f402737f = d17;
        this.f402738g = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s34.p0 a(java.util.Map values, java.lang.String str) {
        s34.p0 p0Var;
        java.lang.Integer h17;
        java.lang.Double e17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        } else if (values.containsKey(str)) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String str2 = (java.lang.String) values.get(str + ".appId");
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = (java.lang.String) values.get(str + ".page");
                java.lang.String str5 = str4 == null ? "" : str4;
                java.lang.String str6 = (java.lang.String) values.get(str + ".query");
                java.lang.String str7 = str6 == null ? "" : str6;
                java.lang.String str8 = (java.lang.String) values.get(str + ".minVersion");
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.String str10 = (java.lang.String) values.get(str + ".isHalfScreen");
                int intValue = (str10 == null || (h18 = r26.h0.h(str10)) == null) ? 0 : h18.intValue();
                java.lang.String str11 = (java.lang.String) values.get(str + ".heightPercent");
                double doubleValue = (str11 == null || (e17 = r26.g0.e(str11)) == null) ? 0.75d : e17.doubleValue();
                java.lang.String str12 = (java.lang.String) values.get(str + ".enableDragToCloseInHalfScreen");
                p0Var = kotlin.Result.m521constructorimpl(new s34.p0(str3, str5, str7, str9, intValue == 1, (doubleValue <= 0.0d || doubleValue >= 1.0d) ? 0.75d : doubleValue, ((str12 == null || (h17 = r26.h0.h(str12)) == null) ? 0 : h17.intValue()) == 1, null));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                p0Var = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(p0Var)) {
                ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(p0Var));
            }
            r6 = kotlin.Result.m527isFailureimpl(p0Var) ? null : p0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
        return r6;
    }
}
