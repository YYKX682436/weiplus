package com.tencent.mm.plugin.lite;

/* loaded from: classes8.dex */
public final class t implements m93.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f144283a;

    public t(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo) {
        this.f144283a = wxaLiteAppInfo;
    }

    @Override // m93.h
    public void a() {
        com.tencent.mars.xlog.Log.w("MicroMsg.WxaLiteAppTaskPreloadReceiver", "geta8key fail: " + this.f144283a.appId);
    }

    @Override // m93.h
    public void b(m93.g info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("geta8key success:");
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f144283a;
        sb6.append(wxaLiteAppInfo.appId);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppTaskPreloadReceiver", sb6.toString());
        java.lang.String str = wxaLiteAppInfo.appId;
        java.lang.String str2 = info.f325032a;
        java.util.Map map = info.f325034c;
        java.util.Map map2 = info.f325035d;
        com.tencent.mm.plugin.lite.LiteAppCenter.setAuthInfo(str, str2, map, map2, true);
        com.tencent.mm.plugin.lite.LiteAppCenter.setAuthInfo(wxaLiteAppInfo.appId, info.f325032a, map, map2, false);
    }
}
