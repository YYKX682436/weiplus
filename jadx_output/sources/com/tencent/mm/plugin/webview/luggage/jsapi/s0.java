package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class s0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "editAddress";
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
        android.content.Intent intent = new android.content.Intent();
        java.lang.String u17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).u();
        intent.putExtra("req_url", u17);
        java.lang.String b17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).K.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17) && !com.tencent.mm.sdk.platformtools.t8.K0(u17) && android.net.Uri.parse(u17).getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
            b17 = "wx62d9035fd4fd2059";
        }
        intent.putExtra("req_app_id", b17);
        intent.putExtra("launch_from_webview", true);
        ((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.r0(this, bVar));
        j45.l.o(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, "address", ".ui.WalletSelectAddrUI", intent, 65535 & hashCode(), false);
    }
}
