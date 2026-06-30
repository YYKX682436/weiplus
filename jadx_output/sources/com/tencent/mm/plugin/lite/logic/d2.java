package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class d2 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f143921a;

    public d2(com.tencent.mm.plugin.lite.logic.g1 g1Var) {
        this.f143921a = g1Var;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp %s fail. errCode: %d", str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.lite.logic.g1.a(this.f143921a, str, null, i17);
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp %s success. info: %s, errCode: %d", wxaLiteAppInfo.appId, wxaLiteAppInfo, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.lite.logic.g1.a(this.f143921a, wxaLiteAppInfo.appId, wxaLiteAppInfo, i17);
    }
}
