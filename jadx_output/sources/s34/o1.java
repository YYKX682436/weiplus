package s34;

/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402724a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402725b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402726c;

    @za4.k1(resType = 5)
    private com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    /* renamed from: d, reason: collision with root package name */
    public s34.g1 f402727d;

    /* renamed from: e, reason: collision with root package name */
    public s34.g1 f402728e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f402729f;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f402723h = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.o1.class, "iconUrl", "getIconUrl()Ljava/lang/String;", 0))};

    /* renamed from: g, reason: collision with root package name */
    public static final s34.n1 f402722g = new s34.n1(null);

    public o1() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f402724a = new com.tencent.mm.plugin.sns.storage.r0();
        this.f402729f = 1500L;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        return adClickActionInfo;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) this.f402724a).a(this, f402723h[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        return str;
    }

    public final java.lang.Long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeInterval", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        java.lang.Long l17 = this.f402729f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeInterval", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        return l17;
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        java.lang.String str = this.f402725b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        return str;
    }

    public final void e(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
        this.clickActionInfo = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.ProductInfo");
    }
}
