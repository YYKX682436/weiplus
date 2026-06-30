package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class n2 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f144031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f144033c;

    public n2(com.tencent.mm.plugin.lite.logic.o2 o2Var, com.tencent.mm.plugin.lite.logic.k2 k2Var, java.lang.String str, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo) {
        this.f144031a = k2Var;
        this.f144032b = str;
        this.f144033c = wxaLiteAppInfo;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        com.tencent.mm.plugin.lite.logic.k2 k2Var = this.f144031a;
        if (k2Var != null) {
            k2Var.f144000e = java.lang.System.currentTimeMillis();
            k2Var.f144001f = k2Var.f144000e;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(qVar.f347349d);
        java.lang.String str = this.f144032b;
        if (!K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", str, java.lang.Integer.valueOf(qVar.f347353h), qVar.f347349d);
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "release", this.f144031a, null, com.tencent.mm.plugin.lite.logic.g1.s().f143949c);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp, url is null, appId:%s errorCode:%d responseState:%d", str, java.lang.Integer.valueOf(qVar.f347354i), qVar.f347347b);
        if (com.tencent.mm.plugin.lite.logic.g1.s().f143949c != null) {
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f144033c;
            if (wxaLiteAppInfo != null) {
                ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).success(wxaLiteAppInfo, 1);
            } else {
                ((com.tencent.mm.plugin.lite.logic.d2) com.tencent.mm.plugin.lite.logic.g1.s().f143949c).fail(str, 2);
            }
        }
    }
}
