package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class a2 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f143892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f143893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.f f143894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppBaselibInfo f143895d;

    public a2(com.tencent.mm.plugin.lite.logic.g1 g1Var, com.tencent.mm.plugin.lite.logic.k2 k2Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.mm.plugin.lite.api.f fVar, com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        this.f143892a = k2Var;
        this.f143893b = liteAppReporter;
        this.f143894c = fVar;
        this.f143895d = wxaLiteAppBaselibInfo;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f143892a;
        if (k2Var != null) {
            k2Var.f144000e = java.lang.System.currentTimeMillis();
            k2Var.f144001f = k2Var.f144000e;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(qVar.f347349d);
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f143893b;
        if (!K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp baselib filesize:%d url:%s", java.lang.Integer.valueOf(qVar.f347353h), qVar.f347349d);
            if (liteAppReporter != null) {
                liteAppReporter.logOther(com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE_SUCCESS, "Tinker");
            }
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.d(qVar, "release", this.f143892a, this.f143893b, this.f143894c);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib, url is null errorCode:%d responseState:%d", java.lang.Integer.valueOf(qVar.f347354i), qVar.f347347b);
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = this.f143895d;
        if (liteAppReporter != null) {
            liteAppReporter.logOther(wxaLiteAppBaselibInfo != null ? com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE_NO_NEED : com.tencent.liteapp.gen.OtherAction.CHECK_BASE_LIBRARY_UPDATE_FAILED, "Tinker");
        }
        com.tencent.mm.plugin.lite.api.f fVar = this.f143894c;
        if (fVar != null) {
            if (wxaLiteAppBaselibInfo != null) {
                fVar.b(wxaLiteAppBaselibInfo, 1);
            } else {
                fVar.a(2);
            }
        }
    }
}
