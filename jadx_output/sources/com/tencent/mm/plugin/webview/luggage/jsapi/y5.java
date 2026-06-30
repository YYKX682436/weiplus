package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class y5 implements com.tencent.mm.plugin.webview.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.f6 f182528b;

    public y5(java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.f6 f6Var) {
        this.f182527a = str;
        this.f182528b = f6Var;
    }

    @Override // com.tencent.mm.plugin.webview.model.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadMediaFileHelp", " on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s", java.lang.Boolean.valueOf(z17), str2, str, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.f182527a)) {
            return;
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this);
        android.app.ProgressDialog progressDialog = com.tencent.mm.plugin.webview.luggage.jsapi.l6.f182385g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            com.tencent.mm.plugin.webview.luggage.jsapi.l6.f182385g = null;
        }
        this.f182528b.a(z17, str2, str3);
    }
}
