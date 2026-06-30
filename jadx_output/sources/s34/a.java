package s34;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f402546a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402547b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402548c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402549d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f402550e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f402551f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f402552g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f402553h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f402554i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f402555j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f402556k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f402557l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f402558m;

    /* renamed from: n, reason: collision with root package name */
    public long f402559n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f402560o;

    /* renamed from: p, reason: collision with root package name */
    public int f402561p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f402562q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f402563r;

    public static s34.a a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
        if (map != null) {
            try {
                if (map.containsKey(str)) {
                    s34.a aVar = new s34.a();
                    aVar.f402546a = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str + ".appointmentId"));
                    java.lang.String str2 = (java.lang.String) map.get(str + ".btnTitleAfterAppointment");
                    java.lang.String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar.f402554i = str2;
                    java.lang.String str4 = (java.lang.String) map.get(str + ".nickname");
                    if (str4 == null) {
                        str4 = "";
                    }
                    aVar.f402547b = str4;
                    java.lang.String str5 = (java.lang.String) map.get(str + ".headImageUrl");
                    if (str5 == null) {
                        str5 = "";
                    }
                    aVar.f402548c = str5;
                    java.lang.String str6 = (java.lang.String) map.get(str + ".title");
                    if (str6 == null) {
                        str6 = "";
                    }
                    aVar.f402549d = str6;
                    java.lang.String str7 = (java.lang.String) map.get(str + ".content");
                    if (str7 == null) {
                        str7 = "";
                    }
                    aVar.f402550e = str7;
                    java.lang.String str8 = (java.lang.String) map.get(str + ".extraContent");
                    if (str8 == null) {
                        str8 = "";
                    }
                    aVar.f402551f = str8;
                    java.lang.String str9 = (java.lang.String) map.get(str + ".submitBtnTitle");
                    if (str9 == null) {
                        str9 = "";
                    }
                    aVar.f402552g = str9;
                    java.lang.String str10 = (java.lang.String) map.get(str + ".cancelBtnTitle");
                    if (str10 == null) {
                        str10 = "";
                    }
                    aVar.f402553h = str10;
                    java.lang.String str11 = (java.lang.String) map.get(str + ".submitSucToast");
                    if (str11 == null) {
                        str11 = "";
                    }
                    aVar.f402555j = str11;
                    java.lang.String str12 = (java.lang.String) map.get(str + ".submitFailedToast");
                    if (str12 == null) {
                        str12 = "";
                    }
                    aVar.f402556k = str12;
                    java.lang.String str13 = (java.lang.String) map.get(str + ".cancelSucToast");
                    if (str13 == null) {
                        str13 = "";
                    }
                    aVar.f402557l = str13;
                    java.lang.String str14 = (java.lang.String) map.get(str + ".cancelFailedToast");
                    if (str14 == null) {
                        str14 = "";
                    }
                    aVar.f402558m = str14;
                    aVar.f402559n = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str + ".expiredTime"));
                    java.lang.String str15 = (java.lang.String) map.get(str + ".expiredBtnTitle");
                    if (str15 == null) {
                        str15 = "";
                    }
                    aVar.f402560o = str15;
                    aVar.f402561p = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".requestPhoneNumber"), 0);
                    java.lang.String str16 = (java.lang.String) map.get(str + ".phoneNumberRequestName");
                    if (str16 == null) {
                        str16 = "";
                    }
                    aVar.f402562q = str16;
                    java.lang.String str17 = (java.lang.String) map.get(str + ".phoneNumberRequestIcon");
                    if (str17 != null) {
                        str3 = str17;
                    }
                    aVar.f402563r = str3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
                    return aVar;
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("AdAppointmentInfo", "parse the update info failed!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
                return null;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAppointmentInfo");
        return null;
    }
}
