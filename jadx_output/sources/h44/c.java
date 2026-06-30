package h44;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f278926a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f278927b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f278928c = "";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f278929d = 2;

    /* renamed from: e, reason: collision with root package name */
    public k44.h f278930e;

    /* renamed from: f, reason: collision with root package name */
    public i64.p0 f278931f;

    /* renamed from: g, reason: collision with root package name */
    public k44.i f278932g;

    public static final h44.c a(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        h44.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppMarketFromClickActionInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppMarketFromClickActionInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams$Companion");
        if (adClickActionInfo == null) {
            com.tencent.mars.xlog.Log.e("AdOpenAppParams", "getAppMarketFromClickActionInfo, clickActionInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppMarketFromClickActionInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams$Companion");
        } else {
            if (adClickActionInfo.f162571b == 2) {
                h44.c cVar2 = new h44.c();
                k44.i iVar = adClickActionInfo.I;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
                cVar2.f278932g = iVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppMarketFromClickActionInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams$Companion");
                cVar = cVar2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppMarketFromClickActionInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
                return cVar;
            }
            com.tencent.mars.xlog.Log.e("AdOpenAppParams", "getAppMarketFromClickActionInfo, clickActionType is not download, clickActionType is " + adClickActionInfo.f162571b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppMarketFromClickActionInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams$Companion");
        }
        cVar = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppMarketFromClickActionInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        return cVar;
    }

    public final k44.h b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenAppHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        k44.h hVar = this.f278930e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenAppHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        return hVar;
    }

    public final k44.i c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        k44.i iVar = this.f278932g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        return iVar;
    }

    public final i64.p0 d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenAppReportParams", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        i64.p0 p0Var = this.f278931f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenAppReportParams", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        return p0Var;
    }

    public final void e(i64.p0 p0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExtraParams", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        this.f278931f = p0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExtraParams", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        this.f278928c = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
    }
}
