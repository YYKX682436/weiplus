package s34;

/* loaded from: classes4.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public int f402774a;

    /* renamed from: b, reason: collision with root package name */
    public int f402775b;

    /* renamed from: c, reason: collision with root package name */
    public int f402776c;

    @za4.k1(resType = 5)
    private com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402777d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f402778e;

    /* renamed from: f, reason: collision with root package name */
    public s34.g1 f402779f;

    /* renamed from: g, reason: collision with root package name */
    public s34.g1 f402780g;

    /* renamed from: h, reason: collision with root package name */
    public s34.g1 f402781h;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f402773j = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.t1.class, "brandImageUrl", "getBrandImageUrl()Ljava/lang/String;", 0))};

    /* renamed from: i, reason: collision with root package name */
    public static final s34.s1 f402772i = new s34.s1(null);

    public t1() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f402777d = new com.tencent.mm.plugin.sns.storage.r0();
    }

    public static final s34.t1 b(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        f402772i.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        s34.t1 t1Var = null;
        t1Var = null;
        t1Var = null;
        t1Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        } else if (a84.b0.c(map) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        } else if (map.containsKey(str)) {
            s34.t1 t1Var2 = new s34.t1();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".containerWidth"));
            t1Var2.f402774a = (str2 == null || (h19 = r26.h0.h(str2)) == null) ? 0 : h19.intValue();
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".containerHeight"));
            t1Var2.f402775b = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".bottomOffset"));
            t1Var2.f402776c = (str4 == null || (h17 = r26.h0.h(str4)) == null) ? 0 : h17.intValue();
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".brandImageUrl"));
            if (str5 == null) {
                str5 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            ((com.tencent.mm.plugin.sns.storage.r0) t1Var2.f402777d).b(t1Var2, f402773j[0], str5);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBrandImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".actionBtnTitle"));
            t1Var2.f402778e = str6 != null ? str6 : "";
            s34.f1 f1Var = s34.g1.f402646c;
            s34.g1 a17 = f1Var.a(map, str.concat(".productBarBackgroundColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProductBarBackgroundColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.f402779f = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProductBarBackgroundColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".actionBtnTitleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionBtnTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.f402780g = a18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionBtnTitleColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            s34.g1 a19 = f1Var.a(map, str.concat(".brandColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBrandColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.f402781h = a19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBrandColorEntity", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
            t1Var2.c(map.containsKey(str.concat(".clickActionInfo")) ? com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".clickActionInfo")) : null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
            t1Var = t1Var2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        return t1Var;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        return adClickActionInfo;
    }

    public final void c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
        this.clickActionInfo = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.SingleProductInfo");
    }
}
