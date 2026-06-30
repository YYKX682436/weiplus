package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class c4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setDesktopInfo";
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
        java.lang.String optString = bVar.f406597b.f344506c.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = bVar.f406597b.f344506c.optString("icon_url");
        java.lang.String optString3 = bVar.f406597b.f344506c.optString("jump_url");
        com.tencent.mm.sdk.platformtools.t8.K0(optString);
        com.tencent.mm.sdk.platformtools.t8.K0(optString2);
        com.tencent.mm.sdk.platformtools.t8.K0(optString3);
        bVar.a();
    }
}
