package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes.dex */
public final class g implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186628b;

    public g(nw4.k kVar, nw4.y2 y2Var) {
        this.f186627a = kVar;
        this.f186628b = y2Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "start liteApp fail");
        nw4.g gVar = this.f186627a.f340863d;
        nw4.y2 y2Var = this.f186628b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "start liteApp success");
    }
}
