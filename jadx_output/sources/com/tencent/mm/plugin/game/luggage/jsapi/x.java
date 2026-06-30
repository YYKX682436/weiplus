package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class x implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139773e;

    public x(com.tencent.mm.plugin.game.luggage.jsapi.y yVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.content.Context context) {
        this.f139772d = q5Var;
        this.f139773e = context;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1137) {
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139772d;
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("ret_info");
                if ("0".equals(stringExtra)) {
                    q5Var.a(null, null);
                } else {
                    q5Var.a(stringExtra, null);
                }
            } else {
                q5Var.a("cancel", null);
            }
            ((com.tencent.mm.ui.MMActivity) this.f139773e).mmSetOnActivityResultCallback(null);
        }
    }
}
