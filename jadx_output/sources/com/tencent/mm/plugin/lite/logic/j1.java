package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class j1 implements t80.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f143990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f143991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f143992d;

    public j1(com.tencent.mm.plugin.lite.logic.g1 g1Var, java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        this.f143992d = g1Var;
        this.f143989a = str;
        this.f143990b = wxaLiteAppInfo;
        this.f143991c = liteAppReporter;
    }

    @Override // t80.f
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate fail, appId: %s, errorType: %d, errorCode: %d, errorMsg: %s", this.f143989a, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.plugin.lite.logic.g1.d(this.f143992d, this.f143989a, i17, i18, str, this.f143991c);
    }

    @Override // t80.f
    public void b(r45.xr5 xr5Var) {
        com.tencent.mm.plugin.lite.logic.g1.c(this.f143992d, this.f143989a, this.f143990b, xr5Var, this.f143991c);
    }
}
