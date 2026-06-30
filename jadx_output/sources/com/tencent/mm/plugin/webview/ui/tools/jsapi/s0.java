package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public final class s0 implements com.tencent.mm.plugin.appbrand.service.p6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185389c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.q6 f185391e;

    public s0(java.lang.String str, int i17, nw4.k kVar, nw4.y2 y2Var, com.tencent.mm.plugin.appbrand.service.q6 q6Var) {
        this.f185387a = str;
        this.f185388b = i17;
        this.f185389c = kVar;
        this.f185390d = y2Var;
        this.f185391e = q6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.p6
    public final void a(com.tencent.mm.plugin.appbrand.service.r6 r6Var) {
        boolean z17 = r6Var == com.tencent.mm.plugin.appbrand.service.r6.Success_AllPkgDownloaded || r6Var == com.tencent.mm.plugin.appbrand.service.r6.Success_AllPkgDownloadedPrevious || r6Var == com.tencent.mm.plugin.appbrand.service.r6.Success_NoNeedGetCode;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreDownloadMiniProgramPackage", "triggerPreDownloadForRequest done. appId:" + this.f185387a + " scene:" + this.f185388b + " result:" + r6Var + " isSuccess:" + z17);
        nw4.y2 y2Var = this.f185390d;
        nw4.k kVar = this.f185389c;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, "predownloadMiniProgramPackage:ok", null);
        } else {
            kVar.f340863d.e(y2Var.f341013c, "predownloadMiniProgramPackage:fail", kz5.b1.e(new jz5.l("errorType", java.lang.Integer.valueOf(r6Var.ordinal()))));
        }
        this.f185391e.f88756f = null;
    }
}
