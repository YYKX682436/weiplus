package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class m8 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186363e;

    public m8(nw4.k kVar, nw4.y2 y2Var) {
        this.f186362d = kVar;
        this.f186363e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8.f186377e == i17) {
            nw4.k kVar = this.f186362d;
            nw4.y2 y2Var = this.f186363e;
            if (i18 == -1) {
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8 n8Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8.f186376d;
                rk0.c.c("MicroMsg.JsApiOpenHKOfflinePayView", "goto hkoffline pay finish", new java.lang.Object[0]);
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8 n8Var2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8.f186376d;
            rk0.c.c("MicroMsg.JsApiOpenHKOfflinePayView", "check pay jspi fail", new java.lang.Object[0]);
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
    }
}
