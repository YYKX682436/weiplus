package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class m4 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182399c;

    public m4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, java.lang.String str, android.content.Context context) {
        this.f182397a = q5Var;
        this.f182398b = str;
        this.f182399c = context;
    }

    @Override // q80.x
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        if (i17 == 2) {
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182397a;
            if (i18 == -1) {
                q5Var.a(null, null);
                z17 = true;
            } else {
                z17 = false;
            }
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 20, 2001, 3, z17 ? 48 : 56, 0, this.f182398b);
            ((q80.z) this.f182399c).R1(null);
            q5Var.a("cancel", null);
        }
    }
}
