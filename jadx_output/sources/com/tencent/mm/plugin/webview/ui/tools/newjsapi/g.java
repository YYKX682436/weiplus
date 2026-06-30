package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class g implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186098e;

    public g(nw4.k kVar, nw4.y2 y2Var) {
        this.f186097d = kVar;
        this.f186098e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.h.f186212e == i17) {
            nw4.k kVar = this.f186097d;
            nw4.y2 y2Var = this.f186098e;
            if (i18 != -1) {
                com.tencent.stubs.logger.Log.i("MicroMsg.JSApiRequestHKCashier", "check pay jspi fail");
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
                return;
            }
            com.tencent.stubs.logger.Log.i("MicroMsg.JSApiRequestHKCashier", "request hk cashier finish");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
            android.content.Context context = kVar.f340860a;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
        }
    }
}
