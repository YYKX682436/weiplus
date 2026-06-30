package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class r1 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186475e;

    public r1(nw4.k kVar, nw4.y2 y2Var) {
        this.f186474d = kVar;
        this.f186475e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.s1.f186509e == i17) {
            nw4.k kVar = this.f186474d;
            nw4.y2 y2Var = this.f186475e;
            if (i18 == -1) {
                rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswd", "get hk encrypt passwd succ", new java.lang.Object[0]);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String stringExtra = intent.getStringExtra("encryptPasswd");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    kotlin.jvm.internal.o.e(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("encryptPasswd", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("signature");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    kotlin.jvm.internal.o.e(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("signature", stringExtra2);
                }
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", linkedHashMap);
                return;
            }
            int intExtra = intent != null ? intent.getIntExtra("retcode", 0) : 0;
            rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswd", "get hk encrypt passwd fail, retcode is " + intExtra, new java.lang.Object[0]);
            if (intExtra == 3) {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail_user cancel", null);
                return;
            }
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
    }
}
