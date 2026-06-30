package s34;

/* loaded from: classes4.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402573a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402574b;

    @za4.k1(resType = 2)
    public java.lang.String bgImageUrl;

    @za4.k1(resType = 2)
    public java.lang.String bgImageUrlDark;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402575c;

    @za4.k1(resType = 5)
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    /* renamed from: d, reason: collision with root package name */
    public float f402576d;

    /* renamed from: e, reason: collision with root package name */
    public float f402577e;

    /* renamed from: f, reason: collision with root package name */
    public float f402578f;

    /* renamed from: g, reason: collision with root package name */
    public int f402579g;

    /* renamed from: h, reason: collision with root package name */
    public int f402580h;

    /* renamed from: i, reason: collision with root package name */
    public int f402581i;

    @za4.k1(resType = 2)
    public java.lang.String iconUrl;

    @za4.k1(resType = 2)
    public java.lang.String iconUrlDark;

    /* renamed from: j, reason: collision with root package name */
    public int f402582j;

    /* renamed from: k, reason: collision with root package name */
    public int f402583k;

    /* renamed from: l, reason: collision with root package name */
    public int f402584l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f402585m = true;

    public static s34.b1 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdTagButtonInfo");
        s34.b1 b1Var = new s34.b1();
        java.lang.String str2 = (java.lang.String) map.get(str + ".bgImageUrl");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        b1Var.bgImageUrl = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".bgImageUrlDark");
        if (str3 == null) {
            str3 = "";
        }
        b1Var.bgImageUrlDark = str3;
        java.lang.String str4 = (java.lang.String) map.get(str + ".iconUrl");
        if (str4 == null) {
            str4 = "";
        }
        b1Var.iconUrl = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".iconUrlDark");
        if (str5 == null) {
            str5 = "";
        }
        b1Var.iconUrlDark = str5;
        java.lang.String str6 = (java.lang.String) map.get(str + ".title");
        if (str6 == null) {
            str6 = "";
        }
        b1Var.f402573a = str6;
        if (android.text.TextUtils.isEmpty(b1Var.bgImageUrlDark) && !android.text.TextUtils.isEmpty(b1Var.bgImageUrl)) {
            b1Var.bgImageUrlDark = b1Var.bgImageUrl;
            com.tencent.mars.xlog.Log.w("AdTagButtonInfo", "bgImageUrlDark is empty");
        }
        if (android.text.TextUtils.isEmpty(b1Var.bgImageUrl) && !android.text.TextUtils.isEmpty(b1Var.bgImageUrlDark)) {
            b1Var.bgImageUrl = b1Var.bgImageUrlDark;
            com.tencent.mars.xlog.Log.w("AdTagButtonInfo", "bgImageUrl is empty");
        }
        if (android.text.TextUtils.isEmpty(b1Var.iconUrlDark) && !android.text.TextUtils.isEmpty(b1Var.iconUrl)) {
            b1Var.iconUrlDark = b1Var.iconUrl;
            com.tencent.mars.xlog.Log.w("AdTagButtonInfo", "iconUrlDark is empty");
        }
        if (android.text.TextUtils.isEmpty(b1Var.iconUrl) && !android.text.TextUtils.isEmpty(b1Var.iconUrlDark)) {
            b1Var.iconUrl = b1Var.iconUrlDark;
            com.tencent.mars.xlog.Log.w("AdTagButtonInfo", "iconUrl is empty");
        }
        java.lang.String str7 = (java.lang.String) map.get(str + ".titleColor");
        if (str7 == null) {
            str7 = "";
        }
        b1Var.f402574b = str7;
        java.lang.String str8 = (java.lang.String) map.get(str + ".titleColorDark");
        b1Var.f402575c = str8 != null ? str8 : "";
        b1Var.f402576d = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".titleColorAlpha"));
        b1Var.f402577e = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".titleColorAlphaDark"));
        b1Var.f402579g = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".basicRootFontSize"), 0);
        b1Var.f402580h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".basicRemWidth"), 0);
        b1Var.f402581i = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".layoutWidth"), 0);
        b1Var.f402582j = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".layoutHeight"), 0);
        b1Var.f402583k = (int) za4.z0.o((double) b1Var.f402581i, 1, b1Var.f402580h, b1Var.f402579g);
        b1Var.f402584l = (int) za4.z0.o((double) b1Var.f402582j, 1, b1Var.f402580h, b1Var.f402579g);
        b1Var.f402578f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".cornerRadius"), 0));
        if (!map.containsKey(str + ".clickActionInfo")) {
            b1Var.f402585m = false;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str + ".clickActionInfo");
        b1Var.clickActionInfo = f17;
        f17.f162569a = 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdTagButtonInfo");
        return b1Var;
    }
}
