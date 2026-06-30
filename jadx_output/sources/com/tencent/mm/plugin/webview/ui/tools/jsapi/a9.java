package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class a9 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f184933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184934b;

    public a9(com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var, nw4.y2 y2Var) {
        this.f184933a = e9Var;
        this.f184934b = y2Var;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        nw4.y2 y2Var = this.f184934b;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var = this.f184933a;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("country_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
            java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
            if (!com.tencent.mm.sdk.platformtools.t8.N0(stringExtra, str)) {
                e9Var.f185084a.i5(y2Var, "ok", kz5.c1.k(new jz5.l("selectedCCNum", str), new jz5.l("selectedCCName", stringExtra)));
                return;
            }
        }
        e9Var.f185084a.i5(y2Var, "pickCountryCode:fail", null);
    }
}
