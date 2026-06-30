package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes.dex */
public final class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186633b;

    public k(nw4.k kVar, nw4.y2 y2Var) {
        this.f186632a = kVar;
        this.f186633b = y2Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestMerchantTransfer", "start liteApp fail");
        nw4.g gVar = this.f186632a.f340863d;
        nw4.y2 y2Var = this.f186633b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "start liteApp success");
    }
}
