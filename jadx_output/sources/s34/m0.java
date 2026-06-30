package s34;

/* loaded from: classes4.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402708a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402709b;

    public static s34.m0 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
        if (a84.b0.c(map) || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return null;
        }
        try {
            s34.m0 m0Var = new s34.m0();
            java.lang.String str2 = (java.lang.String) map.get(str + ".finderUsername");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            m0Var.f402708a = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".exportId");
            if (str4 != null) {
                str3 = str4;
            }
            m0Var.f402709b = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return m0Var;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return null;
        }
    }
}
