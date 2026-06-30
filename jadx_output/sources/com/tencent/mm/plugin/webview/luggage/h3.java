package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class h3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182219e;

    public h3(com.tencent.mm.plugin.webview.luggage.w3 w3Var, java.lang.String str) {
        this.f182219e = w3Var;
        this.f182218d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("result");
        int i17 = bundle.getInt("code_type");
        int i18 = bundle.getInt("code_version");
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182219e;
        w3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewLongClickHelper", "onGetQRCodeResult");
        if (w3Var.f182669j == null) {
            return;
        }
        w3Var.f182660a = string;
        w3Var.f182662c = i17;
        w3Var.f182663d = i18;
        w3Var.f182661b = com.tencent.mm.vfs.w6.N(this.f182218d, 0, -1);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.l3(w3Var));
        if (com.tencent.mm.sdk.platformtools.t8.K0(w3Var.f182660a)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuggageWebViewLongClickHelper", "processGetWXACodeNickName mResultOfImageUrl nil");
            return;
        }
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        int i19 = w3Var.f182662c;
        java.lang.String str = w3Var.f182660a;
        ((jd0.z1) l2Var).getClass();
        if (com.tencent.mm.plugin.scanner.z0.e(i19, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewLongClickHelper", "processGetWXACodeNickName");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("wxa_result", w3Var.f182660a);
            bundle2.putInt("wxa_code_type", w3Var.f182662c);
            bundle2.putInt("wxa_code_version", w3Var.f182663d);
            bundle2.putInt("type", 4);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle2, com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.class, new com.tencent.mm.plugin.webview.luggage.k3(w3Var));
        }
    }
}
