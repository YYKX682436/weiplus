package s34;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f402626a;

    /* renamed from: b, reason: collision with root package name */
    public int f402627b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f402628c = new java.util.ArrayList();

    public static final s34.e1 b(java.util.Map values, java.lang.String prefKey) {
        java.lang.Object m521constructorimpl;
        s34.e1 e1Var;
        java.lang.Object m521constructorimpl2;
        java.lang.Integer h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        if (values.containsKey(prefKey)) {
            s34.e1 e1Var2 = new s34.e1();
            boolean b17 = kotlin.jvm.internal.o.b("1", values.get(prefKey.concat(".isCollectedAd")));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            e1Var2.f402626a = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThemeId", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThemeId", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".collectedAdType"));
            int intValue = (str == null || (h17 = r26.h0.h(str)) == null) ? 0 : h17.intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollectedAdType", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            e1Var2.f402627b = intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollectedAdType", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".subAdItemListString"));
                if (str2 == null) {
                    str2 = "";
                }
                boolean z17 = str2.length() > 0;
                jz5.f0 f0Var = jz5.f0.f302826a;
                if (z17) {
                    try {
                        org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                        int min = java.lang.Math.min(jSONArray.length(), 9);
                        for (int i17 = 0; i17 < min; i17++) {
                            java.util.List a17 = e1Var2.a();
                            s34.u1 u1Var = s34.v1.f402787m;
                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                            kotlin.jvm.internal.o.f(jSONObject, "getJSONObject(...)");
                            ((java.util.ArrayList) a17).add(u1Var.a(jSONObject));
                        }
                        m521constructorimpl2 = kotlin.Result.m521constructorimpl(f0Var);
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    if (kotlin.Result.m527isFailureimpl(m521constructorimpl2)) {
                        ca4.q.c("SnsAd.CollectedAdInfo", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2));
                    }
                    kotlin.Result.m527isFailureimpl(m521constructorimpl2);
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                ca4.q.c("SnsAd.CollectedAdInfo", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
            }
            kotlin.Result.m527isFailureimpl(m521constructorimpl);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo$Companion");
            e1Var = e1Var2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo$Companion");
            e1Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        return e1Var;
    }

    public final java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubAdItemList", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        java.util.List list = this.f402628c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubAdItemList", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        return list;
    }
}
