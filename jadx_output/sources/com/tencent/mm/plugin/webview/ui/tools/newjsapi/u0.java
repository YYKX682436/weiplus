package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class u0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186554e;

    public u0(java.lang.String str, java.lang.String str2) {
        this.f186553d = str;
        this.f186554e = str2;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownloadMediaByUrl", "onProgress mediaId: " + str + ", offset: " + j17 + ", total: " + j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        jz5.l lVar = (jz5.l) kotlin.jvm.internal.m0.c(com.tencent.mm.plugin.webview.ui.tools.newjsapi.v0.f186567e).remove(str);
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiDownloadMediaByUrl", "onFinish: no context found for mediaId: " + str);
            return;
        }
        nw4.k kVar = (nw4.k) lVar.f302833d;
        nw4.y2 y2Var = (nw4.y2) lVar.f302834e;
        if (i17 == 0) {
            java.lang.String str2 = this.f186553d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(str2);
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(dm.i4.COL_LOCALID, b17.f182736e);
                kVar.f340863d.e(y2Var.f341013c, "downloadMediaByUrl:ok", hashMap);
                return;
            }
        }
        kVar.f340863d.e(y2Var.f341013c, "downloadMediaByUrl failed url: " + this.f186554e, null);
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
    }
}
