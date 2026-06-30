package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class h4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setPageTitle";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetPageTitle", "invokeInOwn");
        java.lang.String optString = bVar.f406597b.f344506c.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f406597b.f344506c.optString("color"))) {
            ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).I(optString, 0);
        } else {
            ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).I(optString, com.tencent.mm.plugin.webview.ui.tools.a1.c(bVar.f406597b.f344506c.optString("color"), ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d.getResources().getColor(com.tencent.mm.R.color.f478587bl)));
        }
        bVar.a();
    }
}
