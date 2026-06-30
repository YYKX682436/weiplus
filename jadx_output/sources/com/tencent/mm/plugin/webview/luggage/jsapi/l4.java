package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class l4 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f182384f;

    public l4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, java.lang.String str, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f182382d = q5Var;
        this.f182383e = str;
        this.f182384f = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        if (i17 == 2) {
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182382d;
            if (i18 == -1) {
                q5Var.a(null, null);
                z17 = true;
            } else {
                z17 = false;
            }
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 3, z17 ? 48 : 56, 0, this.f182383e);
            this.f182384f.mmSetOnActivityResultCallback(null);
            q5Var.a("cancel", null);
        }
    }
}
