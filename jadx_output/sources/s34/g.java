package s34;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402633a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402634b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402635c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f402637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f402638f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402639g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402640h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402641i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402642j;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f402632l = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.g.class, "iconUrl", "getIconUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.g.class, "iconDarkUrl", "getIconDarkUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.g.class, "titleJumpActionInfo", "getTitleJumpActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.g.class, "consultButtonJumpActionInfo", "getConsultButtonJumpActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final s34.f f402631k = new s34.f(null);

    public g() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f402639g = new com.tencent.mm.plugin.sns.storage.r0();
        this.f402640h = new com.tencent.mm.plugin.sns.storage.r0();
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr2 = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f402641i = new com.tencent.mm.plugin.sns.storage.k0();
        this.f402642j = new com.tencent.mm.plugin.sns.storage.k0();
    }

    public static final s34.g d(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        s34.g a17 = f402631k.a(map, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        return a17;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getConsultButtonJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) this.f402642j).a(this, f402632l[3]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getConsultButtonJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        return adClickActionInfo;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) this.f402641i).a(this, f402632l[2]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleJumpActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        return adClickActionInfo;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        java.lang.String str = this.f402633a;
        boolean z17 = false;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = this.f402636d;
            if (!(str2 == null || str2.length() == 0)) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdConsultBarInfo");
        return z17;
    }
}
