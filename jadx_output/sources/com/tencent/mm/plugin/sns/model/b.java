package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class b implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f164080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f164081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164082c;

    public b(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, long j17, long j18) {
        this.f164082c = adLandingPagesProxy;
        this.f164080a = j17;
        this.f164081b = j18;
    }

    @Override // za4.r1
    public int a(boolean z17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$11");
        try {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "doRequestDynamicCanvasXml callback, isSuccess is " + z17 + ", pageId is " + this.f164080a);
            this.f164082c.CLIENT_CALL("onGetAdCanvasXmlFromNet", java.lang.Long.valueOf(this.f164081b), java.lang.Boolean.valueOf(z17), str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doRequestDynamicCanvasXml callback, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$11");
        return 0;
    }
}
