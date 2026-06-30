package com.tencent.mm.plugin.lite;

/* loaded from: classes7.dex */
public class t0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f144284a;

    public t0(com.tencent.mm.plugin.lite.w wVar, yz5.l lVar) {
        this.f144284a = lVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check fail, errCode: " + i17);
        this.f144284a.invoke("");
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check success, path: " + wxaLiteAppInfo.path);
        this.f144284a.invoke(wxaLiteAppInfo.path);
    }
}
