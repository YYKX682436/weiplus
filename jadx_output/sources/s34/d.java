package s34;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f402604a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402605b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f402606c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402607d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f402608e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f402609f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f402610g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f402611h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f402612i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f402613j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f402614k;

    /* renamed from: l, reason: collision with root package name */
    public final long f402615l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f402616m;

    public d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, long j17, java.lang.String str11) {
        this.f402604a = i17;
        this.f402605b = str;
        this.f402606c = str2;
        this.f402607d = str3;
        this.f402608e = str4;
        this.f402609f = str5;
        this.f402610g = str6;
        this.f402611h = str7;
        this.f402612i = str8;
        this.f402613j = str9;
        this.f402614k = str10;
        this.f402615l = j17;
        this.f402616m = str11;
    }

    public static final s34.d b(java.util.Map map, java.lang.String str) {
        java.lang.Long j17;
        java.lang.Integer h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        s34.d dVar = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".clickActionType"));
            int intValue = (str2 == null || (h17 = r26.h0.h(str2)) == null) ? 0 : h17.intValue();
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".imageUrl"));
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".iconId"));
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = (java.lang.String) map.get(str.concat(".customIconDescription"));
            java.lang.String str8 = str7 == null ? "" : str7;
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".sourceFooterData"));
            java.lang.String str10 = str9 == null ? "" : str9;
            java.lang.String str11 = (java.lang.String) map.get(str.concat(".sourceVerifyInfo"));
            java.lang.String str12 = str11 == null ? "" : str11;
            java.lang.String str13 = (java.lang.String) map.get(str.concat(".desc"));
            java.lang.String str14 = str13 == null ? "" : str13;
            java.lang.String str15 = (java.lang.String) map.get(str.concat(".emoticonUrl"));
            java.lang.String str16 = str15 == null ? "" : str15;
            java.lang.String str17 = (java.lang.String) map.get(str.concat(".emoticonMd5"));
            java.lang.String str18 = str17 == null ? "" : str17;
            java.lang.String str19 = (java.lang.String) map.get(str.concat(".videoUrl"));
            java.lang.String str20 = str19 == null ? "" : str19;
            java.lang.String str21 = (java.lang.String) map.get(str.concat(".videoMd5"));
            java.lang.String str22 = str21 == null ? "" : str21;
            java.lang.String str23 = (java.lang.String) map.get(str.concat(".expiredTime"));
            long longValue = (str23 == null || (j17 = r26.h0.j(str23)) == null) ? 0L : j17.longValue();
            java.lang.String str24 = (java.lang.String) map.get(str.concat(".expiredToast"));
            if (str24 == null) {
                str24 = "";
            }
            dVar = new s34.d(intValue, str4, str6, str8, str10, str12, str14, str16, str18, str20, str22, longValue, str24);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        return dVar;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        return this.f402613j;
    }
}
