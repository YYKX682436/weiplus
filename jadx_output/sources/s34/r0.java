package s34;

/* loaded from: classes4.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public int f402745a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402746b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402747c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402748d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f402749e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f402750f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f402751g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f402752h;

    /* renamed from: i, reason: collision with root package name */
    public float f402753i;

    /* renamed from: j, reason: collision with root package name */
    public float f402754j;

    @za4.l1
    public java.util.List<s34.q0> likeAnimIconList;

    public static s34.r0 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".liveType");
        if (str2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        try {
            s34.r0 r0Var = new s34.r0();
            r0Var.f402745a = com.tencent.mm.sdk.platformtools.t8.D1(str2, 0);
            java.lang.String str3 = (java.lang.String) map.get(str + ".liveParams");
            java.lang.String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            r0Var.f402746b = str3;
            java.lang.String str5 = (java.lang.String) map.get(str + ".finderUsername");
            if (str5 == null) {
                str5 = "";
            }
            r0Var.f402747c = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".finderLiveId");
            if (str6 != null) {
                str4 = str6;
            }
            r0Var.f402748d = str4;
            r0Var.f402749e = b(map, str + ".pendingDescList");
            r0Var.f402750f = b(map, str + ".livingDescList");
            r0Var.f402751g = b(map, str + ".endDescList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".showLikeAnimation");
            r0Var.f402752h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(sb6.toString()), 0) > 0;
            r0Var.f402753i = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".likeAnimationInterval"));
            r0Var.f402754j = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".likeAnimationScale"));
            r0Var.likeAnimIconList = c(map, str + ".liveCheerIconList");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return r0Var;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
    }

    public static java.util.List b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".descText");
        if (str2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        int i17 = 1;
        while (true) {
            java.lang.String str3 = (java.lang.String) map.get(str + ".descText" + i17);
            if (str3 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
                return arrayList;
            }
            arrayList.add(str3);
            i17++;
        }
    }

    public static java.util.List c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return arrayList;
        }
        java.lang.String str2 = str + ".iconInfo";
        int i17 = 0;
        while (map.containsKey(str2)) {
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".iconUrl");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str2 + ".sampleRate"), 0);
            if (!android.text.TextUtils.isEmpty(str3) && D1 > 0 && D1 <= 100) {
                s34.q0 q0Var = new s34.q0();
                q0Var.iconUrl = str3;
                q0Var.f402743a = D1;
                arrayList.add(q0Var);
            }
            i17++;
            str2 = str + ".iconInfo" + i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        return arrayList;
    }
}
