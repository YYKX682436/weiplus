package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class q1 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f144045a;

    public q1(com.tencent.mm.plugin.lite.logic.g1 g1Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        this.f144045a = liteAppReporter;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "handleCheckSumFail check fail!");
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f144045a;
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_FAILED, i17);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "handleCheckSumFail check success!");
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f144045a;
        if (liteAppReporter == null || wxaLiteAppInfo == null) {
            return;
        }
        liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.ASYNC_CHECK_PACKAGE_UPDATE_SUCCESS, wxaLiteAppInfo.iLinkVersion);
    }
}
