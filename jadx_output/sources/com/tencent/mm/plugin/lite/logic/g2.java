package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class g2 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f143964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f143966c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f143967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f143968e;

    public g2(com.tencent.mm.plugin.lite.logic.g1 g1Var, com.tencent.mm.plugin.lite.logic.k2 k2Var, java.lang.String str, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo) {
        this.f143968e = g1Var;
        this.f143964a = k2Var;
        this.f143965b = str;
        this.f143966c = liteAppReporter;
        this.f143967d = wxaLiteAppInfo;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f143964a;
        if (k2Var != null) {
            k2Var.f144000e = java.lang.System.currentTimeMillis();
            k2Var.f144001f = k2Var.f144000e;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(qVar.f347349d);
        com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f143968e;
        java.lang.String str = this.f143965b;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f143966c;
        if (!K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", str, java.lang.Integer.valueOf(qVar.f347353h), qVar.f347349d);
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_SUCCESS, "Tinker");
            }
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "release", this.f143964a, this.f143966c, g1Var.f143949c);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp boots, url is null errorCode:%d responseState:%d", java.lang.Integer.valueOf(qVar.f347354i), qVar.f347347b);
        if (liteAppReporter != null) {
            int i17 = qVar.f347354i;
            if (5 == i17) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_FAILED, "Tinker", i17);
            } else if (2 == i17) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.CHECK_PACKAGE_UPDATE_NO_NEED, "Tinker");
            }
        }
        com.tencent.mm.plugin.lite.api.h hVar = g1Var.f143949c;
        if (hVar != null) {
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f143967d;
            if (wxaLiteAppInfo != null) {
                ((com.tencent.mm.plugin.lite.logic.d2) hVar).success(wxaLiteAppInfo, 1);
            } else {
                ((com.tencent.mm.plugin.lite.logic.d2) hVar).fail(str, 2);
            }
        }
    }
}
