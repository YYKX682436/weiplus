package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f184502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184504f;

    public l1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, org.json.JSONArray jSONArray, java.lang.String str) {
        this.f184504f = fTSSOSHomeWebViewUI;
        this.f184502d = jSONArray;
        this.f184503e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f184504f.f183844p0;
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onGetVertSearchEntriesData success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("items", this.f184502d);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f184503e);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.e1(nVar, nw4.x2.c("onGetVertSearchEntriesData", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
