package com.tencent.mm.plugin.sns.ad.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppMarketHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppHalfScreenHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdFinderOpenAppMarketHalfScreenHelper extends com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f162660r;

    /* renamed from: s, reason: collision with root package name */
    public k44.a f162661s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f162662t;

    public AdFinderOpenAppMarketHalfScreenHelper(android.content.Context context) {
        super(context);
        this.f162660r = "AdFinderOpenAppMarketHalfScreenHelper";
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper, com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        return this.f162660r;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        android.widget.Button h17 = h();
        if (h17 != null) {
            h17.setOnClickListener(new g44.o(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void m(h44.c adOpenAppParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        kotlin.jvm.internal.o.g(adOpenAppParams, "adOpenAppParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        this.f162686m = adOpenAppParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        h44.c d17 = d();
        i64.p0 d18 = d17 != null ? d17.d() : null;
        if (d18 != null) {
            d18.f289280j = 106;
        }
        i64.p0 d19 = adOpenAppParams.d();
        java.lang.String str = d19 != null ? d19.f289272b : null;
        i64.p0 d27 = adOpenAppParams.d();
        java.lang.String str2 = d27 != null ? d27.f289273c : null;
        i64.p0 d28 = adOpenAppParams.d();
        java.lang.String str3 = d28 != null ? d28.f289277g : null;
        i64.p0 d29 = adOpenAppParams.d();
        java.lang.String str4 = d29 != null ? d29.f289278h : null;
        i64.p0 d37 = adOpenAppParams.d();
        ca4.d dVar = new ca4.d(str, str2, str3, str4, d37 != null ? d37.f289279i : null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        this.f162687n = dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        ca4.d b17 = b();
        if (b17 != null) {
            b17.c(106);
        }
        l44.z.g(b(), 1);
        l44.z.d(b());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void n() {
        android.widget.Button h17;
        k44.i c17;
        k44.i c18;
        k44.i c19;
        k44.i c27;
        k44.i c28;
        k44.i c29;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        h44.c d17 = d();
        java.lang.String str = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0((d17 == null || (c29 = d17.c()) == null) ? null : c29.a())) {
            h44.c d18 = d();
            a84.z.c((d18 == null || (c28 = d18.c()) == null) ? null : c28.a(), e());
        }
        h44.c d19 = d();
        if (!com.tencent.mm.sdk.platformtools.t8.K0((d19 == null || (c27 = d19.c()) == null) ? null : c27.b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
            android.widget.TextView textView = this.f162683g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
            if (textView != null) {
                h44.c d27 = d();
                textView.setText((d27 == null || (c19 = d27.c()) == null) ? null : c19.b());
            }
        }
        h44.c d28 = d();
        if (!com.tencent.mm.sdk.platformtools.t8.K0((d28 == null || (c18 = d28.c()) == null) ? null : c18.c()) && (h17 = h()) != null) {
            h44.c d29 = d();
            if (d29 != null && (c17 = d29.c()) != null) {
                str = c17.c();
            }
            h17.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper
    public void q(ya2.n1 halfScreenListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        kotlin.jvm.internal.o.g(halfScreenListener, "halfScreenListener");
        ((xc2.s1) halfScreenListener).b(new g44.p(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }
}
