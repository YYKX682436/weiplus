package s34;

/* loaded from: classes4.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402595a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402596b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402597c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402598d;

    public static s34.c0 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".finderUsername");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
        try {
            s34.c0 c0Var = new s34.c0();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c0Var.f402595a = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".finderLiveId");
            if (str4 == null) {
                str4 = "";
            }
            c0Var.f402596b = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".finderLiveFeedExportId");
            if (str5 == null) {
                str5 = "";
            }
            c0Var.f402597c = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".finderLiveFeedNonceId");
            if (str6 != null) {
                str3 = str6;
            }
            c0Var.f402598d = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return c0Var;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
    }
}
