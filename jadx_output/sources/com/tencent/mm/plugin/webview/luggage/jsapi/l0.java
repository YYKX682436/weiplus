package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class l0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "currentMpInfo";
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
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String icon = jSONObject.optString("brandIcon");
        java.lang.String optString = jSONObject.optString("brandName");
        java.lang.String optString2 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCurrentMpInfo", "doCurrentMpInfo brandIcon:%s", icon);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(icon)) {
            ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).D.X(icon);
            com.tencent.mm.plugin.webview.luggage.x3 x3Var = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).E;
            x3Var.getClass();
            kotlin.jvm.internal.o.g(icon, "icon");
            x3Var.f182688z = icon;
            x3Var.K(icon);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mm.plugin.webview.luggage.x3 x3Var2 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).E;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = x3Var2.f300077a;
            r45.lr4 v07 = multiTaskInfo != null ? multiTaskInfo.v0() : null;
            if (v07 != null) {
                v07.set(0, optString);
            }
            x3Var2.I();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).D.Z(optString2);
            ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).E.L(optString2);
        }
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).F;
        if (handOffURL != null) {
            if (icon == null) {
                icon = "";
            }
            handOffURL.setIcon(icon);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).F.setTitle(optString);
            }
            ((d73.i) i95.n0.c(d73.i.class)).Jc(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).F);
        }
        bVar.a();
    }
}
