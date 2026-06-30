package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j4 f182436e;

    public p4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, sd.b bVar) {
        this.f182436e = j4Var;
        this.f182435d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.b bVar = this.f182435d;
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var = this.f182436e;
        j4Var.getClass();
        com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var = com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_LINK;
        com.tencent.mm.plugin.webview.luggage.jsapi.f5 f5Var2 = com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_IMG;
        if (jSONObject != null && jSONObject.optString("shareType", "link").equals("image")) {
            f5Var = f5Var2;
        }
        j4Var.f182360e = f5Var;
        if (f5Var != f5Var2) {
            com.tencent.mm.plugin.webview.luggage.jsapi.j4.f(j4Var, bVar);
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = ((sd.a) bVar.f406596a).getContext();
        com.tencent.mm.plugin.webview.luggage.jsapi.k4 k4Var = new com.tencent.mm.plugin.webview.luggage.jsapi.k4(this);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.l(context, k4Var);
    }
}
