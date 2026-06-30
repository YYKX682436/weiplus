package s34;

/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final s34.r1 f402804a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402805b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f402806c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402807d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402808e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f402809f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f402810g;

    /* renamed from: h, reason: collision with root package name */
    public final float f402811h;

    /* renamed from: i, reason: collision with root package name */
    public final int f402812i;

    /* renamed from: j, reason: collision with root package name */
    public final s34.r1 f402813j;

    /* renamed from: k, reason: collision with root package name */
    public final s34.r1 f402814k;

    /* renamed from: l, reason: collision with root package name */
    public final s34.r1 f402815l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f402816m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f402817n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402818o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402819p;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f402803r = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.w0.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.w0.class, "scratchSuccessActionInfo", "getScratchSuccessActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final s34.v0 f402802q = new s34.v0(null);

    public w0(s34.r1 r1Var, java.lang.String textBeforeScratch, java.lang.String titleAfterScratch, java.lang.String subTitleAfterScratch, int i17, java.lang.String voucherNumberStr, java.lang.String discountStr, float f17, int i18, s34.r1 r1Var2, s34.r1 r1Var3, s34.r1 r1Var4, java.lang.String btnTitle) {
        kotlin.jvm.internal.o.g(textBeforeScratch, "textBeforeScratch");
        kotlin.jvm.internal.o.g(titleAfterScratch, "titleAfterScratch");
        kotlin.jvm.internal.o.g(subTitleAfterScratch, "subTitleAfterScratch");
        kotlin.jvm.internal.o.g(voucherNumberStr, "voucherNumberStr");
        kotlin.jvm.internal.o.g(discountStr, "discountStr");
        kotlin.jvm.internal.o.g(btnTitle, "btnTitle");
        this.f402804a = r1Var;
        this.f402805b = textBeforeScratch;
        this.f402806c = titleAfterScratch;
        this.f402807d = subTitleAfterScratch;
        this.f402808e = i17;
        this.f402809f = voucherNumberStr;
        this.f402810g = discountStr;
        this.f402811h = f17;
        this.f402812i = i18;
        this.f402813j = r1Var2;
        this.f402814k = r1Var3;
        this.f402815l = r1Var4;
        this.f402816m = btnTitle;
        int i19 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f402818o = new com.tencent.mm.plugin.sns.storage.k0();
        this.f402819p = new com.tencent.mm.plugin.sns.storage.k0();
    }

    public static final s34.w0 b(java.util.Map values, java.lang.String prefKey) {
        java.lang.Integer h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        f402802q.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        s34.w0 w0Var = null;
        if (values.containsKey(prefKey)) {
            s34.q1 q1Var = s34.r1.f402755g;
            s34.r1 a17 = q1Var.a(values, prefKey.concat(".guidePagInfo"));
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".textBeforeScratch"));
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".titleAfterScratch"));
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = (java.lang.String) values.get(prefKey.concat(".subTitleAfterScratch"));
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = (java.lang.String) values.get(prefKey.concat(".couponType"));
            int intValue = (str7 == null || (h17 = r26.h0.h(str7)) == null) ? 0 : h17.intValue();
            java.lang.String str8 = (java.lang.String) values.get(prefKey.concat(".voucherNumberStr"));
            java.lang.String str9 = str8 == null ? "" : str8;
            java.lang.String str10 = (java.lang.String) values.get(prefKey.concat(".discountStr"));
            java.lang.String str11 = str10 == null ? "" : str10;
            java.lang.String str12 = (java.lang.String) values.get(prefKey.concat(".scratchAreaPercent"));
            java.lang.Float f17 = str12 != null ? r26.g0.f(str12) : null;
            float floatValue = (f17 == null || kotlin.jvm.internal.o.a(f17, 0.0f)) ? 0.3f : f17.floatValue();
            java.lang.String str13 = (java.lang.String) values.get(prefKey.concat(".scratchAreaRadius"));
            java.lang.Integer h18 = str13 != null ? r26.h0.h(str13) : null;
            int intValue2 = (h18 == null || h18.intValue() == 0) ? 25 : h18.intValue();
            s34.r1 a18 = q1Var.a(values, prefKey.concat(".scratchBeginPagInfo"));
            s34.r1 a19 = q1Var.a(values, prefKey.concat(".scratchSuccessLeftPagInfo"));
            s34.r1 a27 = q1Var.a(values, prefKey.concat(".scratchSuccessRightPagInfo"));
            java.lang.String str14 = (java.lang.String) values.get(prefKey.concat(".clickActionInfo.btnTitle"));
            if (str14 == null) {
                str14 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493834pa0);
            }
            java.lang.String str15 = str14;
            kotlin.jvm.internal.o.d(str15);
            w0Var = new s34.w0(a17, str2, str4, str6, intValue, str9, str11, floatValue, intValue2, a18, a19, a27, str15);
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f18 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(values, prefKey.concat(".clickActionInfo"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            com.tencent.mm.plugin.sns.storage.h1 h1Var = w0Var.f402818o;
            f06.v[] vVarArr = f402803r;
            ((com.tencent.mm.plugin.sns.storage.k0) h1Var).b(w0Var, vVarArr[0], f18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f19 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(values, prefKey.concat(".scratchSuccessActionInfo"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            ((com.tencent.mm.plugin.sns.storage.k0) w0Var.f402819p).b(w0Var, vVarArr[1], f19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        return w0Var;
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        boolean z17 = this.f402817n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        return z17;
    }
}
